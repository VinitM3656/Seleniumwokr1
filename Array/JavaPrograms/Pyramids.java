package JavaPrograms;





public class Pyramids {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) { 
            for (int k = 1; k <= size; k++) { 
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); 
            }
            
            System.out.println(); 
        }
    }
}
