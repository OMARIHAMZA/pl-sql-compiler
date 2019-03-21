import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.FilesUtils;
import utils.StatementsListener;
import utils.TypeRepository;
import utils.ast.ASTPrinter;

import java.io.File;
import java.io.IOException;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) throws IOException {
    /*    PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(CharStreams.fromFileName("input.txt"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        PLHQLStatementsParser parser = new PLHQLStatementsParser(commonTokenStream);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        StatementsListener listener = new StatementsListener();
        walker.walk(listener, tree);*/
        TypeRepository.createDirectories("EMPLOYEES");

    }
}