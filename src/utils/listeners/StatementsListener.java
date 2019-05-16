package utils.listeners;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.*;
import org.antlr.v4.runtime.misc.Pair;
import org.stringtemplate.v4.ST;
import utils.BooleanExpressionMatcher;
import utils.TypeRepository;
import utils.files.RubyFile;

import java.lang.reflect.Type;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A sub class of the statement Listener
 */
public class StatementsListener extends PLHQLStatementsBaseListener {

    private Stack<Scope> scopes = new Stack<>(); //Scope stack
    private Queue<Variable> parameters = new ArrayDeque<>(); //Temporary queue of function parameters
    private RubyFile rubyFile;

    /**
     * Actions to be done when reaching a c block
     * This method opens a new scope and adds it
     * to the scope stack
     *
     * @param ctx Current context
     */
    @Override
    public void enterC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.enterC_block(ctx);
        Scope scope = new Scope();
        while (!parameters.isEmpty()) {
            scope.addSymbol(parameters.remove()); //If current scope is a function
            // add function parameters to it
        }
        if (!scopes.isEmpty())
            scope.copySymbols(scopes.peek().getSymbolTable());
        scopes.push(scope);
    }

    /**
     * Actions to be done when closing a C block
     * This method pops last scope when it ends
     *
     * @param ctx Current context
     */
    @Override
    public void exitC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.exitC_block(ctx);
        scopes.pop();
    }

    /**
     * Actions to be done when reaching a c block
     * Also add function to parent scope
     *
     * @param ctx Current context
     */
    @Override
    public void enterC_function(PLHQLStatementsParser.C_functionContext ctx) {
        super.enterC_function(ctx);
        Function function = new Function(ctx.ident().getText(), ctx.dtype().getText());
        if (ctx.c_function_parameter_list() != null) {
            ctx.c_function_parameter_list().c_function_parameter_item().forEach(param -> {
                function.getParameters().add(new Variable(param.ident().getText(), param.dtype().getText()));
                parameters.add(new Variable(param.ident().getText(), param.dtype().getText()));
                //Add function parameters to temporary queue
            });
        }
        if (function.checkOccurrence(scopes.peek())) {
            SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Found multiple definitions of the function");
            return;
        }
        scopes.peek().addSymbol(function); //Add function to parent scope
    }

    /**
     * Add scope variables to scope symbol tables
     *
     * @param ctx Current context
     */
    @Override
    public void enterGeneral_delcaration_c_stmt(PLHQLStatementsParser.General_delcaration_c_stmtContext ctx) {
        super.enterGeneral_delcaration_c_stmt(ctx);

        ctx.ident().forEach(identifier -> {
                    Variable variable = new Variable(identifier.getText(), ctx.dtype().getText());
                    if (variable.checkOccurrence(scopes.peek())) {
                        SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Redeclaration of variable: " + variable.getName());
                        return;
                    }
                    scopes.peek().addSymbol(variable);
                }
        );
    }

    @Override
    public void enterCreate_table_stmt(PLHQLStatementsParser.Create_table_stmtContext ctx) {
        super.enterCreate_table_stmt(ctx);

        String fieldTerminator = (ctx.create_table_preoptions()
                .create_table_options_hive_item()
                .create_table_hive_row_format()
                .string()
                .getText()
                .replaceAll("'", ""));

        String tableLocation = ctx.create_table_preoptions().string().getText().replaceAll("'", "");

        DataType dataType = new DataType(ctx.table_name().getText().toUpperCase(), tableLocation, fieldTerminator);

        ctx.create_table_definition().create_table_columns().create_table_columns_item().forEach(column -> {
            DataMember dataMember = new DataMember(column.dtype().getText().toUpperCase(),
                    column.column_name().getText().toUpperCase());

            dataType.getMembers().put(dataMember.getName().toUpperCase(), dataMember);
        });

        try {
            TypeRepository.addDataType(dataType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx) {
        super.enterSelect_stmt(ctx);
    }

    @Override
    public void exitSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx) {
        super.exitSelect_stmt(ctx);

    }

    @Override
    public void enterProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        rubyFile = RubyFile.getInstance();
        scopes.add(new Scope());
    }

    @Override
    public void exitProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        scopes.pop();
    }

    @Override
    public void enterExpr_atom(PLHQLStatementsParser.Expr_atomContext ctx) {
        super.enterExpr_atom(ctx);
        if (ctx.ident() != null && !scopes.peek().containsSymbol(ctx.getText())) {
            if (ListenerUtils.fromSelectClause(ctx) && !ListenerUtils.checkDataMemberExistence(ctx.ident().getText(), ctx)) {
                SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Usage of undefined variable: " + ctx.getText());
            }
        }
    }


    @Override
    public void enterSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx) {
        super.enterSubselect_stmt(ctx);
        String dataTypeName = ctx.from_clause().from_table_clause().from_table_name_clause().table_name().getText();
        if (!TypeRepository.dataTypeExists(dataTypeName)) {
            SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Usage of undefined DataType: " + dataTypeName);
        }
    }

    @Override
    public void exitFrom_clause(PLHQLStatementsParser.From_clauseContext ctx) {
        super.exitFrom_clause(ctx);
        int overAllLength = ListenerUtils.getOverallSize(ctx.tables);
        StringBuilder code = new StringBuilder();
        String joinsCode = "";
        int counter = 0, previousColumnsCount = 0;
        StringBuilder columnsIndices = new StringBuilder();
        HashMap<String, Integer> tablesOffset = new HashMap<>();
        //Single Table Selection
        if (ctx.tables.size() == 1) {
            processSingleTable(ctx.tables.pop(), ((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).whereCondition, columnsIndices, code);
        } else {
            String previousTable = null;
            //Multiple Tables
            while (!ctx.tables.empty()) {
                String currentItem = ctx.tables.pop();
                if (BooleanExpressionMatcher.matches(currentItem)) {
                    joinsCode = processJoinCondition(ctx, currentItem, counter, columnsIndices, joinsCode);
                } else {
                    if (previousTable != null) {
                        tablesOffset.put(currentItem.toUpperCase(), tablesOffset.get(previousTable) - TypeRepository.getColumnsCount(currentItem));
                    } else {
                        tablesOffset.put(currentItem.toUpperCase(), overAllLength - TypeRepository.typeHashMap.get(currentItem).getMembers().size());
                    }
                    previousTable = currentItem;
                    ST currentTableST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.JOIN_LOOP_TEMPLATE_NAME);
                    currentTableST.add("table_name", currentItem.toLowerCase());
                    currentTableST.add("loop_code", counter == 0 ? "<most_inner>" : code.toString());
                    currentTableST.add("counter", counter++);
                    currentTableST.add("left_record", counter == ctx.tablesCount ? "\"\"" : ("record_" + (counter) + " + \",\""));
                    if (ctx.tables.isEmpty()) {
                        ST leftRightJoinST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.LEFT_RIGHT_JOIN_TEMPLATE_NAME);
                        leftRightJoinST.add("left_table_name", currentItem.toLowerCase());
                        leftRightJoinST.add("left_counter", counter - 1);
                        leftRightJoinST.add("right_columns_count", previousColumnsCount);
                        currentTableST.add("left_join", leftRightJoinST.render());
                    }
                    code = new StringBuilder(currentTableST.render());
                    previousColumnsCount = TypeRepository.typeHashMap.get(currentItem).getMembers().size();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("join_type = \"").append(ctx.joinType).append("\"");
        result.append("\ngrouping_columns = []\n");
        result.append("\nordering_columns = []\n");
        result.append("\nselection_columns = []\n");
        result.append("\nrecords = []\n");
        result.append(columnsIndices);
        result.append(code);
        String whereCondition = ((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).whereCondition;
        if (!whereCondition.isEmpty() && !tablesOffset.isEmpty()) {
            final String regex = "\\w+\\.\\w+";
            final Pattern pattern = Pattern.compile(regex);
            final Matcher matcher = pattern.matcher(whereCondition);
            while (matcher.find()) {
                String group = matcher.group();
                String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
                String columnType = TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType();
                ST columnIndexST = new ST("<table_name>_<column_name>_index = ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
                columnIndexST.add("table_name", tableName.toLowerCase());
                columnIndexST.add("column_name", columnName.toLowerCase());
                whereCondition = whereCondition.replaceFirst(group, "record.split(\",\")[" + tablesOffset.get(tableName.toUpperCase()) + " + " + tableName + "_" + columnName + "_index]" + ListenerUtils.getConversion(columnType));
                result.append("\n").append(columnIndexST.render()).append("\n");
            }
            result.append("\nrecords.keep_if {|record| ").append(whereCondition).append("}");
        }
        result.append("\n").append(getAggregateFunctionColumns(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).aggregateFunctionColumns));
        result.append(getGroupingColumns(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).groupByColumns, tablesOffset));
        result.append(getSelectionColumns(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).selectionColumns, tablesOffset));
        result.append(getOrderColumns(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).orderingColumnsMap, tablesOffset));
        result.append("\nrecords.sort_by!{|record| [").append(getOrderStatement(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).orderingColumnsMap, tablesOffset)).append(" ]}");
        result.append("\nunless selection_columns.empty?\nrecords.map!{|record| record.split(\",\").values_at(*selection_columns).join(\",\")}\nend\n");
        result.append("\nrecords.uniq! if ").append(((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).isDistinct);
        result.append("\n").append(ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.MAP_REDUCE_TEMPLATE_NAME).render());
        result.append("\nputs records");
        String finalCode = result.toString().replaceAll("<most_inner>", joinsCode);
        System.out.println(finalCode);
    }

    @SuppressWarnings("ALL")
    private String getSelectionColumns(ArrayList<String> selectionColumns, HashMap<String, Integer> tablesOffset) {
        StringBuilder result = new StringBuilder();
        result.append("\n\n");
        for (String column : selectionColumns) {
            if (!column.contains(".")) return "";
            String[] splittedColumn = column.split("\\.");
            String tableName = splittedColumn[0], columnName = splittedColumn[1];
            ST selectionColumnTemplateST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.SELECTION_COLUMN_TEMPLATE);
            selectionColumnTemplateST.add("table_name", tableName.toLowerCase());
            selectionColumnTemplateST.add("column_name", columnName.toLowerCase());
            selectionColumnTemplateST.add("table_offset", tablesOffset.containsKey(tableName.toUpperCase()) ? tablesOffset.get(tableName.toUpperCase()) : "0");
            result.append(selectionColumnTemplateST.render());
        }
        return "\n\nif aggregation_columns.empty?" + result.toString() + "\nend";
    }

    @SuppressWarnings("ALL")
    private String getOrderColumns(HashMap<String, String> orderColumnsMap, HashMap<String, Integer> tablesOffset) {
        StringBuilder result = new StringBuilder();
        for (HashMap.Entry<String, String> entry : orderColumnsMap.entrySet()) {
            String[] splitResult = entry.getKey().split("\\.");
            String tableName = splitResult[0], columnName = splitResult[1];
            String orderType = entry.getValue().equalsIgnoreCase("") ? "ASC" : entry.getValue();
            ST selectionColumnTemplateST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.ORDERING_COLUMNS_TEMPLATE_NAME);
            selectionColumnTemplateST.add("table_name", tableName.toLowerCase());
            selectionColumnTemplateST.add("column_name", columnName.toLowerCase());
            selectionColumnTemplateST.add("table_offset", tablesOffset.containsKey(tableName.toUpperCase()) ? tablesOffset.get(tableName.toUpperCase()) : "0");
            selectionColumnTemplateST.add("order_type", orderType);
            result.append(selectionColumnTemplateST.render());
        }
        return result.toString();
    }

    @SuppressWarnings("ALL")
    private String getOrderStatement(HashMap<String, String> orderColumnsMap, HashMap<String, Integer> tablesOffset) {
        StringBuilder result = new StringBuilder();
        for (HashMap.Entry<String, String> entry : orderColumnsMap.entrySet()) {
            String[] splitResult = entry.getKey().split("\\.");
            String tableName = splitResult[0], columnName = splitResult[1];
            String orderType = entry.getValue().equalsIgnoreCase("") ? "ASC" : entry.getValue();
            ST orderExpressionST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.ORDER_BY_STATEMENT_TEMPLATE);
            orderExpressionST.add("table_name", tableName.toLowerCase());
            orderExpressionST.add("table_offset", tablesOffset.isEmpty() ? "0" : tablesOffset.get(tableName.toUpperCase()));
            orderExpressionST.add("column_name", columnName.toLowerCase());
            orderExpressionST.add("conversion", ListenerUtils.getConversion(TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType()));
            orderExpressionST.add("sortType", orderType.equals("ASC") ? "1," : "-1,");
            result.append(orderExpressionST.render());
        }
        return result.toString();
    }

    private String getAggregateFunctionColumns(ArrayList<Pair<String, String>> aggregateFunctionColumns) {
        StringBuilder result = new StringBuilder();
        for (Pair<String, String> pair : aggregateFunctionColumns) {
            if (pair.b.equalsIgnoreCase("*")) {
                result.append("{:function=>:").append(pair.a.toUpperCase())
                        .append(",:index=>").append("-1")
                        .append("},");
            }else{
                //DISTINCT:TABLE_NAME.COLUMN_NAME
                String[] splitted = pair.b.split(":");
                //TABLE_NAME.COLUMN_NAME
                String[] splitResult = splitted[1].split("\\.");
                result.append("{:function=>:").append(pair.a.toUpperCase())
                        .append(",:index=>").append(getColumnIndex(splitResult[0].toLowerCase(), splitResult[1].toLowerCase()))
                        .append(",:type=>:").append(TypeRepository.getMemberType(splitResult[0].toLowerCase(), splitResult[1].toLowerCase()))
                        .append(",:distinct=>").append(splitted[0].toUpperCase().isEmpty() ? "nil" : splitted[0].toUpperCase())
                        .append("},");
            }
        }
        return "aggregation_columns = [" + result.toString() + "]";
    }

    private String getGroupingColumns(ArrayList<String> groupingColumns, HashMap<String, Integer> tablesOffset) {
        StringBuilder result = new StringBuilder();
        for (String s : groupingColumns) {
            String[] splitResult = s.split("\\.");
            result.append("\ngrouping_columns << ").append(getColumnIndex(splitResult[0].toLowerCase(), splitResult[1].toLowerCase())).append(" + ").append(tablesOffset.get(splitResult[0].toUpperCase()) == null ? "0" : tablesOffset.get(splitResult[0].toUpperCase()));
        }
        return "\n" + result.toString() + "\n";
    }

    private String processJoinCondition(PLHQLStatementsParser.From_clauseContext ctx, String currentItem, int counter, StringBuilder columnsIndices, String joinsCode) {
        String firstTable, secondTable, tempBooleanExpression = null;
        secondTable = ctx.tables.pop();
        firstTable = ctx.tables.pop();
        if (BooleanExpressionMatcher.matches(firstTable)) {
            tempBooleanExpression = firstTable;
            firstTable = ctx.tables.pop();
        }

        if (ctx.joinType.toUpperCase().startsWith("RIGHT")) {
            String temp = firstTable;
            firstTable = secondTable;
            secondTable = temp;
        }

        final String regex = "\\w+\\.\\w+";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(currentItem);
        while (matcher.find()) {
            String group = matcher.group();
            String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
            int tempCounter = tableName.equalsIgnoreCase(secondTable) ? counter : counter + 1;
            //Column Index
            ST indexST = new ST("<table_name>_<counter>_<column_name>_index=  ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
            indexST.add("table_name", tableName);
            indexST.add("counter", tempCounter);
            indexST.add("column_name", columnName);
            columnsIndices.append(indexST.render());
            columnsIndices.append("\n");

            //Term Value
            String type = TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType();
            ST termValueST = new ST("<table_name>_<counter>_line.split(\",\")[<table_name>_<counter>_<column_name>_index].strip<conversion>");
            termValueST.add("table_name", tableName);
            termValueST.add("counter", tempCounter);
            termValueST.add("column_name", columnName);
            currentItem = ListenerUtils.getConversion(currentItem, group, type, termValueST);
        }

        ctx.tables.push(firstTable);
        if (tempBooleanExpression != null)
            ctx.tables.push(tempBooleanExpression);
        ctx.tables.push(secondTable);

        ST multipleJoinsTemplate = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.MULTIPLE_JOINS_TEMPLATE_NAME);
        multipleJoinsTemplate.add("table_name", secondTable.toLowerCase());
        multipleJoinsTemplate.add("table_counter", counter);
        multipleJoinsTemplate.add("join_condition", currentItem);
        multipleJoinsTemplate.add("inner_code", counter == 0 ? "records <<  record_0" : joinsCode);
        return multipleJoinsTemplate.render();
    }


    private String mapSingleTableWhereCondition(String whereCondition, StringBuilder columnIndex) {
        final String regex = "\\w+\\.\\w+";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(whereCondition);
        while (matcher.find()) {
            String group = matcher.group();
            String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
            //Column Index
            ST indexST;
            indexST = new ST("<table_name>_<column_name>_index=  ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
            indexST.add("table_name", tableName.toLowerCase());
            indexST.add("column_name", columnName.toLowerCase());
            columnIndex.append(indexST.render());
            columnIndex.append("\n");

            //Term Value
            String type = TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType();
            ST termValueST;
            termValueST = new ST("<table_name>_line.split(\",\")[<table_name>_<column_name>_index].strip<conversion>");
            termValueST.add("table_name", tableName.toLowerCase());
            termValueST.add("column_name", columnName.toLowerCase());
            whereCondition = ListenerUtils.getConversion(whereCondition, group, type, termValueST);
        }
        return whereCondition;
    }

    private void processSingleTable(String tableName, String whereCondition, StringBuilder columnIndex, StringBuilder code) {
        ST singleTableSelectionST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.SINGLE_TABLE_SELECTION_TEMPLATE_NAME);
        singleTableSelectionST.add("table_name", tableName.toLowerCase());
        if (!whereCondition.isEmpty()) {
            singleTableSelectionST.add("where_condition", mapSingleTableWhereCondition(whereCondition, columnIndex));
        }
        code.append(singleTableSelectionST.render());
    }

    private String getColumnIndex(String tableName, String columnName) {
        ST indexST = new ST("ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
        indexST.add("table_name", tableName);
        indexST.add("column_name", columnName);
        return indexST.render();
    }


}
