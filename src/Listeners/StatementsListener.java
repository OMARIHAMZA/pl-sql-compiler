package Listeners;

import antlr.PLHQLStatementsBaseListener;
import antlr.PLHQLStatementsParser;
import models.Token;
import models.TokenType;

import java.util.ArrayList;

public class StatementsListener extends PLHQLStatementsBaseListener {

    private ArrayList<Token> tokens = new ArrayList<>();

    @Override
    public void enterSingle_quotedString(PLHQLStatementsParser.Single_quotedStringContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.STRING, ctx.L_S_STRING().getSymbol().getStartIndex(), ctx.L_S_STRING().getSymbol().getStopIndex()));
        super.enterSingle_quotedString(ctx);
    }

    @Override
    public void enterDouble_quotedString(PLHQLStatementsParser.Double_quotedStringContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.STRING, ctx.L_D_STRING().getSymbol().getStartIndex(), ctx.L_D_STRING().getSymbol().getStopIndex()));
        super.enterDouble_quotedString(ctx);
    }

    @Override
    public void enterBool_literal(PLHQLStatementsParser.Bool_literalContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.KEYWORD, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterBool_literal(ctx);
    }

    @Override
    public void enterNull_const(PLHQLStatementsParser.Null_constContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.KEYWORD, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterNull_const(ctx);
    }

    @Override
    public void enterNull_stmt(PLHQLStatementsParser.Null_stmtContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.KEYWORD, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterNull_stmt(ctx);
    }

    @Override
    public void enterIdent(PLHQLStatementsParser.IdentContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.IDENTIFIER, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterIdent(ctx);
    }

    @Override
    public void enterDec_number(PLHQLStatementsParser.Dec_numberContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.NUMBER, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterDec_number(ctx);
    }

    @Override
    public void enterInt_number(PLHQLStatementsParser.Int_numberContext ctx) {
        tokens.add(new Token(ctx.getText(), TokenType.NUMBER, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterInt_number(ctx);
    }


    /*@Override
    public void enterNon_reserved_words(PLHQLStatementsParser.Non_reserved_wordsContext ctx) {
        System.err.println(ctx.getStart().getStartIndex() + " , " + ctx.getStart().getStopIndex());
        tokens.add(new Token(ctx.getText(), TokenType.KEYWORD, ctx.getStart().getStartIndex(), ctx.getStart().getStopIndex()));
        super.enterNon_reserved_words(ctx);
    }*/

    public ArrayList<Token> getTokens() {
        return tokens;
    }
}
