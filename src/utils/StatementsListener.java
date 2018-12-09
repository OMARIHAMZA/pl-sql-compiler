package utils;

import gen.PLHQLStatementsBaseListener;
import gen.PLHQLStatementsParser;
import models.Scope;
import models.Variable;

import java.util.Stack;

public class StatementsListener extends PLHQLStatementsBaseListener {

    public Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.enterC_block(ctx);
        Scope scope = new Scope();
        if (!scopes.isEmpty())
            scope.copySymbols(scopes.peek().getSymbolTable());
        scopes.push(scope);
    }

    @Override
    public void exitC_block(PLHQLStatementsParser.C_blockContext ctx) {
        super.exitC_block(ctx);
        scopes.pop();
    }

    @Override
    public void enterGeneral_delcaration_c_stmt(PLHQLStatementsParser.General_delcaration_c_stmtContext ctx) {
        super.enterGeneral_delcaration_c_stmt(ctx);
        ctx.ident().forEach(identifier -> {
                    scopes.peek().addSymbol(new Variable(identifier.getText(), ctx.dtype().getText()));
                    System.out.println(ctx.dtype().getText() + " " + identifier.getText());
                }
        );
    }
}
