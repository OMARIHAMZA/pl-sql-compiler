package utils.files;

import java.io.*;

public class RubyFile {

    private static RubyFile rubyFile;

    private File file;

    private RubyFile() {
        file = new File("C:/Users/ASUS/Documents/Github/pl-sql-compiler/ruby/GeneratedMain.rb");
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

    public void println(String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(String data){
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
