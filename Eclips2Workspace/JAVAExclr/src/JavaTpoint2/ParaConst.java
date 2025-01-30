package JavaTpoint2;

class Employee {
    int id;
    String name;

    // Constructor to initialize id and name
    Employee(int id, String name) {
        this.id = id; // Assign the constructor parameter 'id' to the instance variable 'this.id'
        this.name = name; // Assign the constructor parameter 'name' to the instance variable 'this.name'
    }

    // Method to display employee details
    void disp() {
        System.out.println(id + " " + name);
    }
}

public class ParaConst {
    public static void main(String[] args) {
        // Creating instances of Employee class with constructor parameters
        Employee S1 = new Employee(101, "Alice");
        Employee S2 = new Employee(102, "Bob");

        // Calling disp method to display employee details
        S1.disp();
        S2.disp();
    }
}
