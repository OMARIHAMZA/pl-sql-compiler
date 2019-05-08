import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import utils.StatementsListener;
import utils.ThrowingErrorListener;
import utils.TypeRepository;

import java.io.IOException;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) throws IOException {
        TypeRepository.init();
        PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(CharStreams.fromFileName("input.txt"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        PLHQLStatementsParser parser = new PLHQLStatementsParser(commonTokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        StatementsListener listener = new StatementsListener();
        walker.walk(listener, tree);
        //        TypeRepository.createTable("EMPLOYEES");
    }
}