package utils.listeners;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.*;
import org.stringtemplate.v4.ST;
import utils.BooleanExpressionMatcher;
import utils.TypeRepository;
import utils.files.RubyFile;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
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
    public void enterSelect_list_item(PLHQLStatementsParser.Select_list_itemContext ctx) {
        super.enterSelect_list_item(ctx);
    }


    @Override
    public void enterFrom_clause(PLHQLStatementsParser.From_clauseContext ctx) {
        super.enterFrom_clause(ctx);
    }

    @Override
    public void enterFrom_table_name_clause(PLHQLStatementsParser.From_table_name_clauseContext ctx) {
        super.exitFrom_table_name_clause(ctx);
//        rubyFile.println("tables << " + "\"" + ctx.table_name().getText().toUpperCase() + "\"");
    }

    @Override
    public void exitFrom_clause(PLHQLStatementsParser.From_clauseContext ctx) {
        super.exitFrom_clause(ctx);
        StringBuilder code = new StringBuilder();
        int counter = 0, previousColumnsCount = 0;
        StringBuilder columnsIndices = new StringBuilder();
        while (!ctx.tables.empty()) {
            String currentItem = ctx.tables.pop();
            if (BooleanExpressionMatcher.matches(currentItem)) {
                processJoinCondition(ctx, currentItem, counter, columnsIndices, code);
            } else {
                ST currentTableST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.JOIN_LOOP_TEMPLATE_NAME);
                currentTableST.add("table_name", currentItem.toLowerCase());
                currentTableST.add("loop_code", code.toString());
                currentTableST.add("counter", counter++);

                if (counter == 1 && ctx.tables.isEmpty()) {
                }

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

        StringBuilder result = new StringBuilder();
        result.append("join_type = \"").append(ctx.joinType).append("\"");
        result.append("\nrecords = []\n");
        result.append(columnsIndices);
        result.append(code);
        result.append("\nputs records");
        System.out.println(result);

        StringSelection stringSelection = new StringSelection(result.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    private void processJoinCondition(PLHQLStatementsParser.From_clauseContext ctx, String currentItem, int counter, StringBuilder columnsIndices, StringBuilder code) {
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
            if (type.equalsIgnoreCase("INT")) {
                termValueST.add("conversion", ".to_i");
            } else if (type.equalsIgnoreCase("FLOAT")) {
                termValueST.add("conversion", ".to_f");
            } else {
                termValueST.add("conversion", "");
            }
            currentItem = currentItem.replaceFirst(group, termValueST.render());
        }

        ctx.tables.push(firstTable);
        ctx.tables.push(tempBooleanExpression == null ? secondTable : tempBooleanExpression);


        ST joinTypeST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.JOIN_TYPE_TEMPLATE_NAME);
        joinTypeST.add("join_condition", currentItem);
        joinTypeST.add("first_table_name", firstTable.toLowerCase());
        joinTypeST.add("second_table_name", secondTable.toLowerCase());
        joinTypeST.add("first_counter", counter + 1);
        joinTypeST.add("second_counter", counter);
        joinTypeST.add("first_length", TypeRepository.typeHashMap.get(firstTable.toUpperCase()).getMembers().size());
        joinTypeST.add("second_length", TypeRepository.typeHashMap.get(secondTable.toUpperCase()).getMembers().size());

        code.append(joinTypeST.render());

    }

    private void processSingleTable(String tableName, String whereCondition, int counter, StringBuilder columnsIndices, StringBuilder code) {
        ST joinTypeST = ListenerUtils.ST_GROUP_FILE.getInstanceOf(ListenerUtils.WHERE_CONDITION_TEMPLATE_NAME);
        joinTypeST.add("table_name", tableName.toLowerCase());
        joinTypeST.add("counter", counter);
        joinTypeST.add("where_condition", whereCondition);
        code.append(joinTypeST.render());
    }
}
