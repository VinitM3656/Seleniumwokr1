package CodingSekho2;

import java.io.*;

class FileH1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1 = new FileOutputStream("demo.txt", true);
        String s1 = ",college road, Nashik";

        char[] ch = s1.toCharArray();
        int i;
        for (i = 0; i < s1.length(); i++) {
            f1.write(ch[i]);
        }
        f1.close();
    }
}
