package utils.listeners;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import utils.BooleanExpressionMatcher;
import utils.TypeRepository;
import utils.files.RubyFile;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.listeners.ListenerUtils.*;

/**
 * A sub class of the statement Listener
 */
public class StatementsListener extends PLHQLStatementsBaseListener {

    private Stack<Scope> scopes = new Stack<>(); //Scope stack
    private Queue<Variable> parameters = new ArrayDeque<>(); //Temporary queue of function parameters
    private StringBuilder generatedCode = new StringBuilder();
    private RubyFile rubyFile;
    private boolean initializedVariables = false; //To avoid duplicated initialization of variables
    private ArrayList<String> programFunctions = new ArrayList<>(); //All functions defined in the program
    private int queryCounter = 0;
    private boolean firstJoin = true;

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
        ListenerUtils.checkReturnStatementsType(ctx);
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
                    Variable variable = new Variable(identifier.getText(), ctx.dtype() != null ? ctx.dtype().getText() : "var");
                    if (variable.checkOccurrence(scopes.peek())) {
                        SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Redeclaration of variable: " + variable.getName());
                        return;
                    }
                    scopes.peek().addSymbol(variable);
                }
        );

        //Check if the current statement is assigning query result to a variable
        if (ctx.expr(0).select_stmt() != null) {
            PLHQLStatementsParser.Select_stmtContext context = ctx.expr(0).select_stmt();

            //Create Temp Data Type

            String dataTypeName = ctx.ident.getText().toUpperCase();

            ArrayList<String> columns = context.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().selectionColumns;

            ArrayList<String> tables = context.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().tables;

            LinkedHashMap<String, DataMember> dataMembers = new LinkedHashMap<>();

            if (columns.contains("*")) {
                for (String table : tables) {
                    dataMembers.putAll(TypeRepository.typeHashMap.get(table.toUpperCase()).getMembers());
                }
            } else {
                for (String column : columns) {
                    String[] splitResult = column.split("\\.");
                    String tableName = splitResult[0], columnName = splitResult[1];
                    dataMembers.put(columnName, new DataMember(columnName, TypeRepository.getMemberType(tableName, columnName)));
                }
            }

            JSONArray jsonArray = new JSONArray();
            dataMembers.forEach((s, dataMember) -> jsonArray.put(dataMember.toJSON()));

            DataType dataType = new DataType(dataTypeName, dataMembers);
            dataType.setTemp(true);
            dataType.setTableLocation("C:/Users/Asus/Documents/Github/pl-sql-compiler/ruby/" + queryCounter + "_query");
            dataType.setFieldTerminator(",");

            try {
                TypeRepository.addDataType(dataType);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Add the table definition to type repository
     * Every table has columns with data types and a field terminator
     *
     * @param ctx Current context
     */

    @Override
    public void enterCreate_table_stmt(PLHQLStatementsParser.Create_table_stmtContext ctx) {
        super.enterCreate_table_stmt(ctx);

        String fieldTerminator = (ctx.create_table_preoptions()
                .create_table_options_hive_item()
                .create_table_hive_row_format()
                .string()
                .getText()
                .replaceAll("'", "")); //Get field terminator

        String tableLocation = ctx.create_table_preoptions()
                .string()
                .getText()
                .replaceAll("'", ""); //get directory of table

        DataType dataType = new DataType(
                ctx.table_name().getText().toUpperCase(),
                tableLocation,
                fieldTerminator);//Define the new table name with a few options

        ctx.create_table_definition().create_table_columns().create_table_columns_item()
                .forEach(column -> {
                    DataMember dataMember = new DataMember(
                            column.dtype().getText().toUpperCase(),
                            column.column_name().getText().toUpperCase());//Add each column to the table definition

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
        if (!initializedVariables) {
            initializedVariables = true;
            generatedCode.append("\ngrouping_columns = []\n");
            generatedCode.append("ordering_columns = []\n");
            generatedCode.append("selection_columns = []\n");
            generatedCode.append("records = []\n\n");
        }
    }


    /**
     * Initialize ruby file to generate code to
     * and add a global scope to the scope stack
     *
     * @param ctx Current context
     */
    @Override
    public void enterProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        programFunctions.addAll(ctx.functions);
        TypeRepository.deleteTempDataTypes();
        rubyFile = RubyFile.getInstance();
        scopes.add(new Scope());
    }

    @Override
    public void exitProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        scopes.pop();
        if (!SyntaxSemanticErrorListener.semanticErrorOccurred){
            ST mainClassTemplate = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.RUBY_MAIN_CLASS_TEMPLATE);
            mainClassTemplate.add("code", generatedCode);
            rubyFile.print(mainClassTemplate.render());
            runRubyProgram();
        }
    }

    /**
     * Check if a variable is defined in the current scope if it is used in an expression
     *
     * @param ctx Current context
     */

    @Override
    public void enterExpr_atom(PLHQLStatementsParser.Expr_atomContext ctx) {
        super.enterExpr_atom(ctx);

        if (ListenerUtils.fromSelectClause(ctx) && ctx.ident() != null) {
            String[] splitResult = ctx.ident().getText().split("\\.");
            if (splitResult.length == 2)
                if (!TypeRepository.dataMemberExists(splitResult[0], splitResult[1])) {
                    SyntaxSemanticErrorListener.INSTANCE.semanticError(
                            ctx.start.getLine(),
                            "Unknown column: " + ctx.getText()); //log a semantic error
                }
        }

        if (!ListenerUtils.fromSelectClause(ctx) && ctx.ident() != null && !scopes.peek().containsSymbol(ctx.getText()))
        //If variable is not defined in the current scope
        {
            SyntaxSemanticErrorListener.INSTANCE.semanticError(
                    ctx.start.getLine(),
                    "Usage of undefined variable: " + ctx.getText()); //log a semantic error
        }

        ListenerUtils.checkVariableAssignment(ctx);
    }

    /**
     * Check if current table in the select is defined in the type repository
     *
     * @param ctx Current context
     */

    @Override
    public void enterSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx) {
        super.enterSubselect_stmt(ctx);
        for (HashMap.Entry<Pair<String, String>, ParserRuleContext> entry : ctx.analyticalFunctions.entrySet()) {
            System.out.println(((PLHQLStatementsParser.Expr_func_over_clauseContext) entry.getValue()).expr_func_partition_by_clause() == null);
        }
        if (isSubselectStatement(ctx.parent)) {
            ArrayList<String> selectionColumns = ctx.selectionColumns;
            LinkedHashMap<String, DataMember> members = new LinkedHashMap<>();
            if (selectionColumns.contains("*")) {
                for (String table : ctx.from_clause().tables) {
                    if (!BooleanExpressionMatcher.matches(table)) {
                        members.putAll(TypeRepository.typeHashMap.get(table.toUpperCase()).getMembers());
                    }
                }
            } else {
                for (String selectionColumn : ctx.selectionColumns) {
                    String[] splitResult = selectionColumn.split("\\.");
                    members.put(splitResult[1].toUpperCase(), new DataMember(splitResult[1].toUpperCase(), TypeRepository.getMemberType(splitResult[0].toUpperCase(), splitResult[1].toUpperCase())));
                }
            }
            DataType dataType = new DataType(ListenerUtils.getSubselectStmtAlias(ctx), members);
            dataType.setTemp(true);
            dataType.setFieldTerminator(",");
            new File("C:/Users/ASUS/Documents/GitHub/pl-sql-compiler/ruby/" + getSubselectStmtAlias(ctx)).mkdirs();
            dataType.setTableLocation("C:/Users/ASUS/Documents/GitHub/pl-sql-compiler/ruby/" + getSubselectStmtAlias(ctx));
            try {
                TypeRepository.addDataType(dataType);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Main code for generating code for select statments
     *
     * @param ctx Current context
     */

    @Override
    public void exitFrom_clause(PLHQLStatementsParser.From_clauseContext ctx) {

        super.exitFrom_clause(ctx);

        int overAllLength = ListenerUtils.getOverallSize(ctx.tables, ((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent)); //Number of tables in from clause

        StringBuilder code = new StringBuilder(); //Code inside the nested loop of join

        String joinsCode = "";

        int counter = 0 // counter for each table in the join nested loops
                , previousColumnsCount = 0; //Number of columns in the previous table of the join

        StringBuilder columnsIndices =
                new StringBuilder(); //Print indices of the columns needed to pass it to the code generator

        HashMap<String, Integer> tablesOffset = new HashMap<>();//Offset to add to the indices


        //Single Table Selection
        if (ctx.tables.size() == 1) {

            processSingleTable(
                    ctx.tables.pop(),
                    ((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).whereCondition,
                    columnsIndices,
                    code); //Generate code for a single table

        } else {
            // Joins
            String previousTable = null;

            generatedCode.append("\n  ExecutionPlanUtilities::write_to_execution_plan(\"Nested Loop Join\")\n");

            //Multiple Tables
            while (!ctx.tables.empty()) {
                String currentItem = ctx.tables.pop();
                if (BooleanExpressionMatcher.matches(currentItem)) {
                    //This is a join condition for example "on (table1.id==table2.fk)"

                    joinsCode = processJoinCondition(
                            ctx,
                            currentItem,
                            counter,
                            columnsIndices,
                            joinsCode);//Generate code for a join condition


                } else { //Calculate tables offset
                    ListenerUtils.checkSemanticError(ctx, currentItem);
                    if (previousTable != null) {
                        //Not the first table to be added
                        if (TypeRepository.typeHashMap.containsKey(currentItem.toUpperCase())) {
                            tablesOffset.put(
                                    currentItem.toUpperCase(),
                                    tablesOffset.get(previousTable) -
                                            TypeRepository.getColumnsCount(currentItem));
                        }
                    } else {
                        //First table
                        tablesOffset.put(
                                currentItem.toUpperCase(),
                                overAllLength -
                                        TypeRepository.typeHashMap
                                                .get(currentItem).
                                                getMembers().size());
                    }
                    previousTable = currentItem;

                    if (counter == 0) {
                        code.append("\n<most_inner>\n");
                    }

                    counter++;
                    /*ST currentTableST = ListenerUtils
                            .ST_GROUP_FILE
                            .getInstanceOf(
                                    ListenerUtils.JOIN_LOOP_TEMPLATE_NAME);
                    //Get an instance of the nested loop join string template
                    currentTableST.add("table_name", currentItem.toLowerCase());
                    currentTableST.add("loop_code", counter == 0 ? "<most_inner>" : code.toString());
                    currentTableST.add("left_record", counter == ctx.tablesCount - 1 ? "\"\"" : ("record_" + (counter + 1) + " + \",\""));
                    currentTableST.add("counter", counter++);*/


                   /* if (ctx.tables.isEmpty()) {
                        //Process outer joins
                        ST leftRightJoinST = ListenerUtils
                                .ST_GROUP_FILE
                                .getInstanceOf(ListenerUtils.LEFT_RIGHT_JOIN_TEMPLATE_NAME);
                        //Get an instance of the outer join string template

                        leftRightJoinST.add("left_table_name", currentItem.toLowerCase());
                        leftRightJoinST.add("left_counter", counter - 1);
                        leftRightJoinST.add("right_columns_count", previousColumnsCount);
                        currentTableST.add("left_join", leftRightJoinST.render());
                    }*/
//                    code = new StringBuilder(currentTableST.render());
                    previousColumnsCount = TypeRepository.typeHashMap.get(currentItem).getMembers().size();
                }
            }
        }

        generatedCode.append("join_type = \"").append(ctx.joinType).append("\"\n");
        generatedCode.append(columnsIndices);
        generatedCode.append(code);
        generatedCode = new StringBuilder(generatedCode.toString().replaceAll("<most_inner>", joinsCode));
        ((PLHQLStatementsParser.Subselect_stmtContext) ctx.parent).tablesOffset.putAll(tablesOffset);
    }

    @Override
    public void exitSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx) {
        super.exitSubselect_stmt(ctx);
        validateGroupingColumns(ctx);
        HashMap<String, Integer> tablesOffset = ctx.tablesOffset;//Offset to add to the indices

        String whereCondition = (ctx).whereCondition;
        if (!whereCondition.isEmpty() && !tablesOffset.isEmpty()) {

            generatedCode.append("\n  ExecutionPlanUtilities::write_to_execution_plan(\"Where Condition\")\n");

            //If there is a where condition generate appropriate code

            final String regex = "\\w+\\.\\w+";
            final Pattern pattern = Pattern.compile(regex);
            whereCondition = whereCondition.replaceAll("isnull", " ==\"\"");
            whereCondition = whereCondition.replaceAll("isnotnull", " !=\"\"");
            final Matcher matcher = pattern.matcher(whereCondition);
            while (matcher.find()) {
                String group = matcher.group();
                String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
                String columnType = TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType();
                ST columnIndexST = new ST("<table_name>_<column_name>_index = ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
                columnIndexST.add("table_name", tableName.toLowerCase());
                columnIndexST.add("column_name", columnName.toLowerCase());
                whereCondition = whereCondition.replaceFirst(group, "record.split(\",\")[" + tablesOffset.get(tableName.toUpperCase()) + " + " + tableName + "_" + columnName + "_index]" + ListenerUtils.getConversion(columnType));
                generatedCode.append("\n").append(columnIndexST.render()).append("\n");
            }


            //Apply where condition
            generatedCode.append("\nrecords.keep_if {|record| ").append(whereCondition).append("}");
        }

        generatedCode.append("\n").append(generateHavingCode(ctx));

        generatedCode.append("\n").append(
                getAggregateFunctionColumns(
                        ctx.aggregateFunctionColumns));

        //Generate code for getting columns used in aggregation functions

        generatedCode.append(
                getGroupingColumns(
                        ctx.groupByColumns,
                        ctx.tablesOffset));
        //Generate code for getting group by columns

        generatedCode.append(
                getSelectionColumns(
                        ctx.selectionColumns,
                        ctx.tablesOffset));
        //Generate code for getting columns to select


        generatedCode.append("\n").append(
                getOrderColumns(
                        ctx.orderingColumnsMap,
                        tablesOffset));
        //Generate code for getting columns to order by

        if (ctx.orderingColumnsMap.size() > 0)
            generatedCode.append("\n  ExecutionPlanUtilities::write_to_execution_plan(\"Sort Order By\")\n");

        generatedCode.append(
                "\nrecords.sort_by!{|record| [")
                .append(
                        getOrderStatement(ctx.orderingColumnsMap,
                                tablesOffset)).
                append(" ]}");
        //Generate code to order generatedCode set

        generatedCode.append(generateAnalyticalFunctions(ctx.analyticalFunctions));

        generatedCode.append(
                "\nunless selection_columns.empty?\nrecords.map!{|record| record.split(\",\").values_at(*selection_columns).join(\",\")}\nend\n");
        //Generate code for select clause (projection)

        if (ctx.isDistinct) {
            generatedCode.append("\n  ExecutionPlanUtilities::write_to_execution_plan(\"Distinct\")\n");
        }
        generatedCode.append("\nrecords.uniq! if ")
                .append(
                        ctx.isDistinct);
        //Generate code for selecting distinct values

        generatedCode.append("\n")
                .append(ListenerUtils
                        .ST_GROUP_FILE
                        .getInstanceOf(ListenerUtils.MAP_REDUCE_TEMPLATE_NAME).render());


        if (ListenerUtils.isSubselectStatement(ctx.parent)) {
            ST subselectionST = new ST("\nExecutionPlanUtilities.process_subselect_statement(records, \"<table_alias>\", <selection_columns>)");
            subselectionST.add("table_alias", getSubselectStmtAlias(ctx));
            subselectionST.add("selection_columns", getColumnsJSONArray(ctx.selectionColumns, ctx.tables));
            generatedCode.append(subselectionST.render());
            generatedCode.append("\nrecords = []\n");
            generatedCode.append("\nselection_columns = []\n");
        } else {
            generatedCode.append("\nputs records if aggregation_columns.empty? && ! ").append(fromDeclarationStatement(ctx)).append("\n");
        }

    }


    private String getColumnsJSONArray(ArrayList<String> selectionColumns, ArrayList<String> tables) {
        JSONArray resultArray = new JSONArray();
        for (String column : selectionColumns) {
            if (column.equalsIgnoreCase("*")) {
                for (String table : tables) {
                    if (!BooleanExpressionMatcher.matches(table)) {
                        LinkedHashMap<String, DataMember> members = new LinkedHashMap<>(TypeRepository.typeHashMap.get(table.toUpperCase()).getMembers());
                        members.forEach((s, dataMember) -> {
                            JSONObject jsonObject = new JSONObject();
                            try {
                                jsonObject.put(s, dataMember.getType());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            resultArray.put(jsonObject);
                        });
                    }
                }
                return resultArray.toString();
            }
            String[] splitResult = column.split("\\.");
            String tableName = splitResult[0], columnName = splitResult[1];
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put(columnName.toUpperCase(), TypeRepository.getMemberType(tableName.toUpperCase(), columnName.toUpperCase()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            resultArray.put(jsonObject);
        }
        return resultArray.toString();
    }

    private String generateAnalyticalFunctions(HashMap<Pair<String, String>, ParserRuleContext> analyticalFunctions) {

        StringBuilder result = new StringBuilder();

        for (HashMap.Entry<Pair<String, String>, ParserRuleContext> entry : analyticalFunctions.entrySet()) {

            StringBuilder analyticalKeys = new StringBuilder("[");
            StringBuilder analyticalAggregationColumn = new StringBuilder();

            PLHQLStatementsParser.Expr_func_over_clauseContext ctx = (PLHQLStatementsParser.Expr_func_over_clauseContext) entry.getValue();

            if (ctx.expr_func_partition_by_clause() == null) break;

            for (PLHQLStatementsParser.ExprContext exprContext : ctx.expr_func_partition_by_clause().expr()) {
                //exprContext.getText() = TABLE_NAME.COLUMN_NAME
                String[] splitResult = exprContext.getText().split("\\.");
                String tableName = splitResult[0], columnName = splitResult[1];
                analyticalKeys.append(getColumnIndex(tableName, columnName)).append(",");
            }

            analyticalKeys.append("]");

            if (entry.getKey().b.contains("*")) {
                analyticalAggregationColumn.append("{:function=>:").append(entry.getKey().a.toUpperCase())
                        .append(",:index=>").append("-1")
                        .append("},");
            } else {
                //DISTINCT:TABLE_NAME.COLUMN_NAME
                String[] splitted = entry.getKey().b.split(":");
                //TABLE_NAME.COLUMN_NAME
                String[] splitResult = splitted[1].split("\\.");
                analyticalAggregationColumn.append("{:function=>:").append(entry.getKey().a.toUpperCase())
                        .append(",:index=>").append(getColumnIndex(splitResult[0].toLowerCase(), splitResult[1].toLowerCase()))
                        .append(",:type=>:").append(TypeRepository.getMemberType(splitResult[0].toLowerCase(), splitResult[1].toLowerCase()))
                        .append(",:distinct=>").append(splitted[0].toUpperCase().isEmpty() ? "nil" : splitted[0].toUpperCase())
                        .append("},");

            }
            ST st = ST_GROUP_FILE.getInstanceOf("processAnalyticalFunction");
            st.add("analytical_keys", analyticalKeys);
            st.add("analytical_aggregation_function", analyticalAggregationColumn);

            result.append("\n").append(st.render()).append("\nselection_columns << record_length");
        }


        return result.toString() + "\n";
    }

    /**
     * Code for select clause (projection)
     *
     * @param selectionColumns Columns used in select calues
     * @param tablesOffset     Offsets for tables after joins
     * @return Code generated to added to the genarated file (select/projection)
     */
    @SuppressWarnings("ALL")
    private String getSelectionColumns(ArrayList<String> selectionColumns,
                                       HashMap<String, Integer> tablesOffset) {

        StringBuilder result = new StringBuilder();
        result.append("\n\n");

        int counter = 0;

        for (String column : selectionColumns) {

            if (!column.contains(".")) return "";

            if (!matchesColumnSyntax(column)) continue;

            String[] splittedColumn = column.split("\\.");
            String tableName = splittedColumn[0], columnName = splittedColumn[1];

            ST selectionColumnTemplateST =
                    ListenerUtils
                            .ST_GROUP_FILE
                            .getInstanceOf(ListenerUtils.SELECTION_COLUMN_TEMPLATE);

            selectionColumnTemplateST.add("table_name", tableName.toLowerCase());
            selectionColumnTemplateST.add("column_name", columnName.toLowerCase());
            selectionColumnTemplateST.add("table_offset",
                    tablesOffset.containsKey(tableName.toUpperCase()) ?
                            tablesOffset.get(tableName.toUpperCase()) :
                            "0");

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

    private String getAggregateFunctionColumns(Set<Pair<String, String>> aggregateFunctionColumns) {
        StringBuilder result = new StringBuilder();
        for (Pair<String, String> pair : aggregateFunctionColumns) {
            if (pair.b.contains("*")) {
                result.append("{:function=>:").append(pair.a.toUpperCase())
                        .append(",:index=>").append("-1")
                        .append("},");
            } else {
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

        //Left Outer Join
        if (ctx.joinType.toUpperCase().contains("LEFT")) {

            String result;

            if (firstJoin) {
                firstJoin = false;
                result = processFirstLeftJoin(currentItem, firstTable, secondTable, counter + 1, counter, columnsIndices);
            } else {
                result = processNonFirstLeftJoin(currentItem, firstTable, secondTable, counter + 1, counter, columnsIndices);
            }

            ctx.tables.push(firstTable);
            if (tempBooleanExpression != null)
                ctx.tables.push(tempBooleanExpression);
            ctx.tables.push(secondTable);


            firstJoin = false;

            return joinsCode + "\n\n" + result;


        }else if (ctx.joinType.toUpperCase().contains("RIGHT")){

            String result;

            if (firstJoin) {
                firstJoin = false;
                result = processFirstRightJoin(currentItem, firstTable, secondTable, counter + 1, counter, columnsIndices);
            } else {
                result = processNonFirstRightJoin(currentItem, firstTable, secondTable, counter + 1, counter, columnsIndices);
            }

            ctx.tables.push(firstTable);
            if (tempBooleanExpression != null)
                ctx.tables.push(tempBooleanExpression);
            ctx.tables.push(secondTable);


            firstJoin = false;

            return joinsCode + "\n\n" + result;

        }
        //Outer Join
        if (ctx.joinType.toUpperCase().contains("RIGHT")
                || ctx.joinType.toUpperCase().contains("OUTER")) {

            String result = processOuterJoin(firstTable, secondTable, counter + 1, counter, currentItem, columnsIndices);

            ctx.tables.push(firstTable);
            if (tempBooleanExpression != null)
                ctx.tables.push(tempBooleanExpression);
            ctx.tables.push(secondTable);


            firstJoin = false;

            return joinsCode + "\n\n" + result;

        }

        ctx.tables.push(firstTable);
        if (tempBooleanExpression != null)
            ctx.tables.push(tempBooleanExpression);
        ctx.tables.push(secondTable);

        ST innerJoinST;

        //First Inner Join
        if (firstJoin) {
            firstJoin = false;
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
            innerJoinST = ST_GROUP_FILE.getInstanceOf(FIRST_INNER_JOIN_LOOP_TEMPLATE);
            innerJoinST.add("left_table_name", firstTable.toLowerCase());
            innerJoinST.add("right_table_name", secondTable.toLowerCase());
            innerJoinST.add("left_counter", counter + 1);
            innerJoinST.add("right_counter", counter);
            innerJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
            innerJoinST.add("right_table_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());
            innerJoinST.add("join_condition", currentItem);
        } else { // Non-first inner join
            innerJoinST = ST_GROUP_FILE.getInstanceOf(NON_FIRST_INNER_JOIN_LOOP_TEMPLATE);
            innerJoinST.add("left_table_name", firstTable.toLowerCase());
            innerJoinST.add("left_counter", counter + 1);
            innerJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
            innerJoinST.add("join_condition", processNonFirstOuterJoinCondition(currentItem, firstTable, counter + 1, columnsIndices, "prev_join"));
        }

        return joinsCode + "\n" + innerJoinST.render();
    }

    private String mapSingleTableWhereCondition(String whereCondition, StringBuilder columnIndex) {
        final String regex = "(\\w+\\.\\w+)";
        final Pattern pattern = Pattern.compile(regex);
        whereCondition = whereCondition.replaceAll("isnull", " ==\"\"");
        whereCondition = whereCondition.replaceAll("isnotnull", " !=\"\"");
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

    private String generateHavingCode(PLHQLStatementsParser.Subselect_stmtContext ctx) {
        StringBuilder result = new StringBuilder();
        if (ctx.having_clause() != null) {
            PLHQLStatementsParser.Having_clauseContext havingClauseContext = ctx.having_clause();
            int counter = 1;
            for (Pair<String, String> pair : ctx.having_clause().aggregateFunctionColumns) {
                Pair<String, String> currentCondition = havingClauseContext.conditions.get(counter - 1);
                if (pair.b.equalsIgnoreCase("*")) {
                    result.append(",:index=>").append(getIndexOfFunction(pair.a, pair.b, ctx))
                            .append("},");
                } else {
                    //DISTINCT:TABLE_NAME.COLUMN_NAME
                    String[] splitted = pair.b.split(":");
                    //TABLE_NAME.COLUMN_NAME
                    String[] splitResult = splitted[1].split("\\.");
                    result.append("{:function=>:").append(pair.a.toUpperCase())
                            .append(",:index=>").append(getIndexOfFunction(pair.a, pair.b, ctx))
                            .append(",:condition=>").append("\"").append(currentCondition.b).append("\"")
                            .append(",:function_after_condition=>").append(currentCondition.a.equalsIgnoreCase("AFTER"))
                            .append(",:type=>:").append(TypeRepository.getMemberType(splitResult[0].toLowerCase(), splitResult[1].toLowerCase()))
                            .append("},");
                }
                counter++;
            }
        }
        return "having_conditions = [" + result.toString() + "]";
    }

    /**
     * returns the index of the aggregation function in the select list
     *
     * @param functionName: Aggregation function name, Example: COUNT
     * @param columnName:   Example: EMPLOYEES.SALARY
     * @param ctx           ;
     * @return function index
     */
    private int getIndexOfFunction(String functionName, String columnName, PLHQLStatementsParser.Subselect_stmtContext ctx) {
        int counter = 0;
        for (Pair<String, String> pair : ctx.aggregateFunctionColumns) {
            counter += 1;
            if (pair.a.equalsIgnoreCase(functionName) && pair.b.equalsIgnoreCase(columnName)) return counter;
        }
        return -1;
    }

    /**
     * Code to throw error if the called c function does not exist
     */
    @Override
    public void enterCall_stmt(PLHQLStatementsParser.Call_stmtContext ctx) {
        super.enterCall_stmt(ctx);
        if (!programFunctions.contains(ctx.ident().getText())) {
            SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Invalid call of undeclared method (" + ctx.ident().getText() + ")");
        }
    }

    @Override
    public void exitSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx) {
        super.exitSelect_stmt(ctx);
        generatedCode.append("\n  ExecutionPlanUtilities::write_query_to_file(records, query_counter)\nquery_counter += 1\n");
        queryCounter += 1;
        firstJoin = true;
    }


    private String processOuterJoin(String leftTable, String rightTable, int leftCounter, int rightCounter, String joinCondition, StringBuilder columnsIndices) {
        if (firstJoin) {
            return processFirstOuterJoin(joinCondition, leftTable, rightTable, leftCounter, rightCounter, columnsIndices);
        } else {
            return processNonFirstOuterJoin(joinCondition, leftTable, leftCounter, columnsIndices);
        }
    }

    @SuppressWarnings("ALL")
    private String processJoinCondition(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {
        final String regex = "\\w+\\.\\w+";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(condition);
        while (matcher.find()) {
            String group = matcher.group();
            String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
            int tempCounter = tableName.equalsIgnoreCase(secondTable) ? secondCounter : firstCounter;
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
            condition = ListenerUtils.getConversion(condition, group, type, termValueST);
        }
        return condition;
    }

    private String processFirstOuterJoin(String joinCondition, String leftTable, String rightTable, int leftCounter, int rightCounter, StringBuilder columnsIndices) {
        ST outerJoinTemplate = ST_GROUP_FILE.getInstanceOf(FIRST_OUTER_JOIN_TEMPLATE);
        outerJoinTemplate.add("left_table_name", leftTable.toLowerCase());
        outerJoinTemplate.add("left_table_counter", leftCounter);
        outerJoinTemplate.add("right_table_name", rightTable.toLowerCase());
        outerJoinTemplate.add("right_counter", rightCounter);
        outerJoinTemplate.add("right_table_length", TypeRepository.typeHashMap.get(rightTable.toUpperCase()).getMembers().size());
        outerJoinTemplate.add("left_table_length", TypeRepository.typeHashMap.get(leftTable.toUpperCase()).getMembers().size());
        String processedJoinCondition = processJoinCondition(joinCondition, leftTable, rightTable, leftCounter, rightCounter, columnsIndices);
        outerJoinTemplate.add("join_condition", processedJoinCondition);
        System.err.println(columnsIndices.toString());
        return outerJoinTemplate.render();
    }

    private String processNonFirstOuterJoin(String joinCondition, String leftTable, int leftCounter, StringBuilder columnsIndices) {
        ST outerJoinTemplate = ST_GROUP_FILE.getInstanceOf(NON_FIRST_JOIN_TEMPLATE);

        //left_table_name, left_table_counter, join_condition, left_table_length
        outerJoinTemplate.add("left_table_name", leftTable.toLowerCase());
        outerJoinTemplate.add("left_table_counter", leftCounter);
        outerJoinTemplate.add("left_table_length", TypeRepository.typeHashMap.get(leftTable.toUpperCase()).getMembers().size());
        String processedJoinCondition = processNonFirstOuterJoinCondition(joinCondition, leftTable, leftCounter, columnsIndices, "prev_outer");
        outerJoinTemplate.add("join_condition", processedJoinCondition);

        return outerJoinTemplate.render();
    }

    @SuppressWarnings("ALL")
    private String processNonFirstOuterJoinCondition(String condition, String firstTable, int firstCounter, StringBuilder columnsIndices, String alias) {
        final String regex = "\\w+\\.\\w+";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(condition);
        while (matcher.find()) {
            String group = matcher.group();
            String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
            String tableNameAlias = tableName.equalsIgnoreCase(firstTable) ? firstTable.toLowerCase() : alias;
            String mCounter = tableName.equalsIgnoreCase(firstTable) ? "_" + firstCounter : "";

            //Column Index
            ST indexST = new ST("<table_name_alias><counter>_<column_name>_index =  ExecutionPlanUtilities::get_column_index(\"<table_name>\", \"<column_name>\")");
            indexST.add("table_name_alias", tableNameAlias);
            indexST.add("table_name", tableName);
            indexST.add("column_name", columnName);
            indexST.add("counter", mCounter);
            columnsIndices.append(indexST.render());
            columnsIndices.append("\n");


            //Term Value
            String type = TypeRepository.typeHashMap.get(tableName.toUpperCase()).getMembers().get(columnName.toUpperCase()).getType();
            ST termValueST = new ST("<table_name_alias><counter>_line.split(\",\")[<table_name_alias><counter>_<column_name>_index].strip<conversion>");
            termValueST.add("table_name_alias", tableNameAlias);
            termValueST.add("table_name", tableName);
            termValueST.add("column_name", columnName);
            termValueST.add("counter", mCounter);
            condition = ListenerUtils.getConversion(condition, group, type, termValueST);
        }
        return condition;
    }

    @SuppressWarnings("ALL")
    private String processFirstLeftJoin(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {

        ST leftJoinST = ST_GROUP_FILE.getInstanceOf("FirstLeftOuterJoin");

        leftJoinST.add("left_table_name", firstTable.toLowerCase());
        leftJoinST.add("left_counter", firstCounter);
        leftJoinST.add("right_table_name", secondTable.toLowerCase());
        leftJoinST.add("right_counter", secondCounter);
        leftJoinST.add("join_condition", processOuterJoinCondition(condition, firstTable, secondTable, firstCounter, secondCounter, columnsIndices));
        leftJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
        leftJoinST.add("right_table_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());

        return leftJoinST.render();

    }

    private String processNonFirstLeftJoin(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {
        ST leftJoinST = ST_GROUP_FILE.getInstanceOf("NonFirstLeftOuterJoin");
        leftJoinST.add("left_table_name", firstTable.toLowerCase());
        leftJoinST.add("left_counter", firstCounter);
        leftJoinST.add("right_table_name", secondTable.toLowerCase());
        leftJoinST.add("right_counter", secondCounter);
        leftJoinST.add("join_condition", processNonFirstOuterJoinCondition(condition, firstTable, firstCounter, columnsIndices, "prev_outer"));
        leftJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
        leftJoinST.add("right_table_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());
        return leftJoinST.render();

    }

    private String processFirstRightJoin(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {
        ST rightJoinST = ST_GROUP_FILE.getInstanceOf("FirstRightOuterJoin");
        rightJoinST.add("left_table_name", firstTable.toLowerCase());
        rightJoinST.add("right_table_name", secondTable.toLowerCase());
        rightJoinST.add("left_counter", firstCounter);
        rightJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
        rightJoinST.add("right_table_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());
        rightJoinST.add("right_counter", secondCounter);
        rightJoinST.add("join_condition", processOuterJoinCondition(condition, firstTable, secondTable, firstCounter, secondCounter, columnsIndices));
        return rightJoinST.render();
    }

    private String processNonFirstRightJoin(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {
        ST rightJoinST = ST_GROUP_FILE.getInstanceOf("NonFirstRightOuterJoin");
        rightJoinST.add("left_table_name", firstTable.toLowerCase());
        rightJoinST.add("right_table_name", secondTable.toLowerCase());
        rightJoinST.add("left_counter", firstCounter);
        rightJoinST.add("left_table_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
        rightJoinST.add("right_table_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());
        rightJoinST.add("right_counter", secondCounter);
        rightJoinST.add("join_condition", processNonFirstOuterJoinCondition(condition, secondTable, secondCounter, columnsIndices, "prev_outer"));
        return rightJoinST.render();
    }

    @SuppressWarnings("ALL")
    private String processOuterJoinCondition(String condition, String firstTable, String secondTable, int firstCounter, int secondCounter, StringBuilder columnsIndices) {
        final String regex = "\\w+\\.\\w+";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(condition);
        while (matcher.find()) {
            String group = matcher.group();
            String tableName = group.split("\\.")[0].toLowerCase(), columnName = group.split("\\.")[1].toLowerCase();
            int tempCounter = tableName.equalsIgnoreCase(secondTable) ? secondCounter : firstCounter;
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
            condition = ListenerUtils.getConversion(condition, group, type, termValueST);
        }
        return condition;
    }
}
