package JavaTpoint2;

class Test {
    int id;
    String name;
}

public class Student {
    public static void main(String[] args) {
        Test s1 = new Test(); // Create an instance of the Test class
        s1.id = 1; // Assign a value to the id variable
        s1.name = "John"; // Assign a value to the name variable

        System.out.println(s1.id); // Print the id
        System.out.println(s1.name); // Print the name
    }
}
