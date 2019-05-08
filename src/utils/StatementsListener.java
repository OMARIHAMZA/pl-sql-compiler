package utils;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.*;
import org.stringtemplate.v4.ST;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * A sub class of the statement Listener
 */
public class StatementsListener extends PLHQLStatementsBaseListener {

    private Stack<Scope> scopes = new Stack<>(); //Scope stack
    private Queue<Variable> parameters = new ArrayDeque<>(); //Temporary queue of function parameters

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
                    scopes.peek().addSymbol(new Variable(identifier.getText(), ctx.dtype().getText()));
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
    public void enterError_stmt(PLHQLStatementsParser.Error_stmtContext ctx) {
        super.enterError_stmt(ctx);
    }

    @Override
    public void enterProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        TypeRepository.createRubyFile();
        scopes.add(new Scope());
    }

    @Override
    public void exitProgram(PLHQLStatementsParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        scopes.pop();
    }
}
