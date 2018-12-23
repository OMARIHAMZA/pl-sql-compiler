package uiback;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.StatementsListener;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        try {
            //noinspection deprecation
            CharStream charStream = new ANTLRInputStream(new FileInputStream("C:\\Users\\HAMZA\\Desktop\\input.txt"));
            PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            PLHQLStatementsParser parser = new PLHQLStatementsParser(tokenStream);
            ParseTree parseTree = parser.c_stmt();
            ParseTreeWalker walker = new ParseTreeWalker();
            StatementsListener listener = new StatementsListener();
            walker.walk(listener, parseTree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}