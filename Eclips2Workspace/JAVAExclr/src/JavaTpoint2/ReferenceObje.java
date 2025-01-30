package JavaTpoint2;

class Student {
    int id;
    String name;
}

public class ReferenceObje {
    public static void main(String[] args) {
        Student s1 = new Student(); // Create an instance of the Student class
        
        s1.id = 101; // Assign a value to the id variable
        s1.name = "Vinit"; // Assign a value to the name variable
        
        System.out.println(s1.id + " " + s1.name); // Print id and name
    }
}
