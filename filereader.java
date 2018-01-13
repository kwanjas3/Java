import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        String content = null;
        File file = new File("/home/jk/IdeaProjects/NumbersGame/src/expenses.txt"); //for ex foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
             if (reader !=null){reader.close();}
            } catch(IOException e) {
                System.out.println("something bad happened " + e);
            }
        }
        System.out.println(content);
    }
}
