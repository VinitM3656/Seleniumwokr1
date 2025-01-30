package FarhaanRevision;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Interner;

import java.util.HashSet;
import java.util.Set;

public class Dupplicaet {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 2, 31, 34, 32};
        Set<Integer> UniqueSet = new HashSet<>();
        Set<Integer> DuplicateSet = new HashSet<>();

        for (int val : a) {
            if (!UniqueSet.add(val)) {
                DuplicateSet.add(val);
            }
        }

        System.out.println("UniqueSet values: " + UniqueSet);
        System.out.println("DuplicateSet Values: " + DuplicateSet);
    }
}
