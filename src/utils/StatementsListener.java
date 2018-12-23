package utils;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.Function;
import models.Scope;
import models.ScopeSymbol;
import models.Variable;

import java.util.*;

public class StatementsListener extends PLHQLStatementsBaseListener {

    public Stack<Scope> scopes = new Stack<>();
    private Queue<Variable> parameters = new ArrayDeque<>();


    @Override
    public void enterC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.enterC_block(ctx);
        Scope scope = new Scope();
        while (!parameters.isEmpty()) {
            scope.addSymbol(parameters.remove());
        }
        if (!scopes.isEmpty())
            scope.copySymbols(scopes.peek().getSymbolTable());
        scopes.push(scope);
    }

    @Override
    public void exitC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.exitC_block(ctx);
        for (HashMap.Entry<String, ScopeSymbol> entry : scopes.peek().getSymbolTable().entrySet()) {
            System.out.println(entry.getValue().getType() + " " + entry.getValue().getName());
        }
        scopes.pop();
    }

    @Override
    public void enterC_function(PLHQLStatementsParser.C_functionContext ctx) {
        super.enterC_function(ctx);
        Function function = new Function(ctx.ident().getText(), ctx.dtype().getText());
        ctx.c_function_parameter_list().c_function_parameter_item().forEach(param -> {
            function.getParameters().add(new Variable(param.ident().getText(), param.dtype().getText()));
            parameters.add(new Variable(param.ident().getText(), param.dtype().getText()));
        });
        scopes.peek().addSymbol(function);
    }

    @Override
    public void enterGeneral_delcaration_c_stmt(PLHQLStatementsParser.General_delcaration_c_stmtContext ctx) {
        super.enterGeneral_delcaration_c_stmt(ctx);
        ctx.ident().forEach(identifier -> {
                    scopes.peek().addSymbol(new Variable(identifier.getText(), ctx.dtype().getText()));
                }
        );
    }
}
