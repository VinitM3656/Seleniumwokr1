package May01.SDETQ;

import java.util.ArrayList; // Import ArrayList class

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>(); // Specify the type of elements (Object for different types)

        list.add("welcome");
        list.add(100);
        list.add(10.4);
        list.add(true);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Before inserting: " + list);
    }
}
