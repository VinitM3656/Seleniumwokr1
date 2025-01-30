package VinitGDB;

public class JavaForEachLoop {
    public static void main(String[] args) {
        int[] marks = {76, 34, 23, 45, 67, 87, 54, 32};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[] cities = {"New Delhi", "Mumbai", "Pune", "Chennai", "Bangalore"};

        System.out.println("Marks:");
        for (int i : marks) {
            System.out.println(i);
        }

        System.out.println("Vowels:");
        for (char i : vowels) {
            System.out.println(i);
        }

        System.out.println("Cities:");
        for (String i : cities) {
            System.out.println(i);
        }
    }
}
