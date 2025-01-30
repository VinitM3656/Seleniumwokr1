package JavaPrograms;

public class ReversePyramid {
    public static void main(String[] args) {
        int size = 19;
        for (int i = size; i >= 1; i--) { // Corrected the variable name from "1" to "i"
            for (int j = i; j < size; j++) {
                System.out.print(" "); // Changed println to print to print spaces horizontally
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("**&&"); 
                // Changed println to print to print stars horizontally
            }
            System.out.println(); // Moved this inside the outer loop to print a new line after each row
        }
    }
}

