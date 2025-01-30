package May01.SDETQ;

//import java.util.ArrayList; // Import ArrayList class
import java.util.List; // Import List interface

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Instantiate ArrayList with proper syntax

        list.add("John");
        list.add("Vinit");
        list.add("Scott");
        list.add("Smit");

        System.out.println("Size of the list: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
