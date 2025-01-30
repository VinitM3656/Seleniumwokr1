package JavaPrograms;

public class Pyramid4 {
    public static void main(String[] args) {
        int size = 8;
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) { // Changed println to print to print spaces horizontally
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Changed println to print to print numbers horizontally
                System.out.print(k + " ");
            }
            for (int i1 = i - 1; i1 >= 1; i1--) { // Corrected variable name from i1 to i in the loop condition
                System.out.print(i1 + " "); // Changed println to print to print numbers horizontally
            }
            System.out.println(); // Moved this inside the outer loop to print a new line after each row
        }
    }
}
