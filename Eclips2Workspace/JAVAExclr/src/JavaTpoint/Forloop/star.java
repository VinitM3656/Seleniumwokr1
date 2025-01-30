package JavaTpoint.Forloop;

public class star {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*"); // changed println to print to print stars on the same line
            }
            System.out.println(); // added to move to the next line after printing each row of stars
        }
    }
}
