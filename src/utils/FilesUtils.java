package utils;

import java.io.File;
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

}
