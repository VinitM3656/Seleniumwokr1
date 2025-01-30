package JavaPrograms;

import java.util.ArrayList;

public class ClassMain {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("A");
        a.add("A");
        a.add("A");
        a.add("A");
        System.out.println("----------------------------------------------------");

        // Corrected for loop
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

       // System.out.println("----------------------------------------------------");

        // Enhanced for loop
       // for (String i : a) {
         //   System.out.println(i);
        }
    }
//}
