package JavaPrograms;

public class Pyramid3 {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 1; i <= size; i++) { // Added missing braces for the outer loop
            for (int k = i; k <= size - 1; k++) {
                System.out.print(" "); // Changed println to print to print spaces horizontally
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Changed println to print to print stars horizontally
            }
            System.out.println(); // Moved this inside the outer loop to print a new line after each row
        }
    }
}

