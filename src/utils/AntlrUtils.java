package utils;

import Listeners.StatementsListener;
import antlr.PLHQLStatementsLexer;
import antlr.PLHQLStatementsParser;
import antlr.PLSQLKeywordLexer;
import antlr.PLSQLKeywordParserParser;
import models.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Listeners.KeywordsListener;

import java.util.ArrayList;

public class AntlrUtils {

    public static ArrayList<Token> getTokensFromText(String text){
        CharStream charStream = new ANTLRInputStream(text);
        PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        PLHQLStatementsParser parser = new PLHQLStatementsParser(commonTokenStream);
        ParseTree parseTree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        StatementsListener statementsListener = new StatementsListener();
        walker.walk(statementsListener, parseTree);
        return statementsListener.getTokens();
    }

}
