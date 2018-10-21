package Listeners;

import antlr.PLSQLKeywordParserBaseListener;
import antlr.PLSQLKeywordParserParser;
import models.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class KeywordsListener extends PLSQLKeywordParserBaseListener {

    private ArrayList<Token> tokens = new ArrayList<>();


    @Override
    public void enterStatement(PLSQLKeywordParserParser.StatementContext ctx) {
        for (PLSQLKeywordParserParser.KeywordContext keywordContext : ctx.keyword()) {
            tokens.add(new Token(keywordContext.KEYWORD().getText(),
                    keywordContext.KEYWORD().getSymbol().getStartIndex(),
                    keywordContext.KEYWORD().getSymbol().getStopIndex()));
        }
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(PLSQLKeywordParserParser.StatementContext ctx) {

        super.exitStatement(ctx);
    }

    @Override
    public void enterKeyword(PLSQLKeywordParserParser.KeywordContext ctx) {
        super.enterKeyword(ctx);
    }

    @Override
    public void exitKeyword(PLSQLKeywordParserParser.KeywordContext ctx) {
        super.exitKeyword(ctx);
    }

    @Override
    public void enterError(PLSQLKeywordParserParser.ErrorContext ctx) {
        super.enterError(ctx);
    }

    @Override
    public void exitError(PLSQLKeywordParserParser.ErrorContext ctx) {
        super.exitError(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public ArrayList<Token> getKeywords() {
        return tokens;
    }

}
