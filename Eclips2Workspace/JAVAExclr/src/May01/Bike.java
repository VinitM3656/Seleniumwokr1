package May01;

public class Bike {
    void run() {
        System.out.println("Bike is running safely");
    }

    static class Splendro extends Bike {
        @Override
        void run() {
            System.out.println("Splendro is running fast");
        }
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run(); // Calls the run() method of the Bike class
        
        Splendro splendro = new Splendro();
        splendro.run(); // Calls the overridden run() method of the Splendro class
    }
}
