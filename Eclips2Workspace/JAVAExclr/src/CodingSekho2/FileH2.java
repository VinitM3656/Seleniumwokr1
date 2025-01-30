package CodingSekho2;
import java.io.*;

public class FileH2 {

    public static void main(String[] args) {
        try {
            FileOutputStream f1 = new FileOutputStream("demo.txt", true);

            String s1 = "abc, college road, nashik";
            char[] ch = s1.toCharArray();

            for (int i = 0; i < s1.length(); i++) {
                f1.write(ch[i]);
            }
            
            f1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
