package utils;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.listeners.BooleanExpressionListener;

public class BooleanExpressionMatcher {


    public static boolean matches(String expression) {
        try {
            PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(CharStreams.fromString(expression));
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            PLHQLStatementsParser parser = new PLHQLStatementsParser(commonTokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(BooleanExpressionListener.BooleanExpressionSyntaxErrorListener.INSTANCE);
            ParseTree tree = parser.bool_expr();
            ParseTreeWalker walker = new ParseTreeWalker();
            BooleanExpressionListener listener = new BooleanExpressionListener();
            walker.walk(listener, tree);
        } catch (ParseCancellationException e) {
            return false;
        }
        return true;
    }

}
