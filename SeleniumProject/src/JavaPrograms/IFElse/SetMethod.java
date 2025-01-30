package JavaPrograms.IFElse;



public class SetMethod {
    private String name; // Declare the name variable

    // Setter method to set the value of the name variable
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method to retrieve the value of the name variable
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        SetMethod myObj = new SetMethod(); // Create an object of SetMethod class
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName()); // Display the value of the name variable
    }
}
