package utils.files;

import java.io.*;

public class RubyFile {

    private static RubyFile rubyFile;

    private File file;

    private RubyFile() {
        file = new File("Generated.rb");
        if (file.exists()) {
            //noinspection all
            file.delete();
        }
        try {
            //noinspection all
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RubyFile getInstance() {
        if (rubyFile == null) rubyFile = new RubyFile();
        return rubyFile;
    }

    void println(String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(String data){
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
