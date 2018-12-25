package utils;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesUtils {

    public static String getPreviousSession() {
        File file = new File("pl-sql.txt");
        try {
            return new Scanner(file).useDelimiter("\\Z").next();
        } catch (Exception e) {
            return "";
        }
    }

    public static void saveSession(String text) {
        File file = new File("pl-sql.txt");
        try {
            if (!file.exists()) //noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(text);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PLHQLStatementsParser.ProgramContext parse(File file) throws IOException {
        String code = new Scanner(new FileInputStream(file)).useDelimiter("\\Z").next();
        PLHQLStatementsLexer lexer = new PLHQLStatementsLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLHQLStatementsParser parser = new PLHQLStatementsParser(tokens);
        return parser.program();
    }
}
