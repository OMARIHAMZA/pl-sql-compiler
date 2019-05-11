package utils.listeners;

import gen.PLHQLStatementsBaseListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class BooleanExpressionListener extends PLHQLStatementsBaseListener {

    public static class BooleanExpressionSyntaxErrorListener extends BaseErrorListener {

        public static final BooleanExpressionSyntaxErrorListener INSTANCE = new BooleanExpressionSyntaxErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            throw new ParseCancellationException(msg);
        }
    }
}
