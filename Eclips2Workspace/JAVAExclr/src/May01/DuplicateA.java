package May01;

import java.util.HashSet;
import java.util.Set;

public class DuplicateA {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // Changed Set type to Integer and corrected the HashSet type
        set.add(1);
        set.add(2);
        for (Integer element : set) { // Changed the loop to iterate over elements in the set
            System.out.println(element); // Print each element in the set
        }
    }
}
