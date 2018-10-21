package utils;

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
        PLSQLKeywordLexer lexer = new PLSQLKeywordLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        PLSQLKeywordParserParser parser = new PLSQLKeywordParserParser(commonTokenStream);
        ParseTree parseTree = parser.statement();
        ParseTreeWalker walker = new ParseTreeWalker();
        KeywordsListener keywordsListener = new KeywordsListener();
        walker.walk(keywordsListener, parseTree);
        return keywordsListener.getKeywords();
    }

}
