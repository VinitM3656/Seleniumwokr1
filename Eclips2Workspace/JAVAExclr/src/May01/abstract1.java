package May01;

public abstract class abstract1 {
    abstract void run(); // Declared run() as abstract in the abstract class

    static class Honda extends abstract1 {
        @Override
        void run() {
            System.out.println("Running safely");
        }

        public static void main(String[] args) {
            Honda honda = new Honda();
            honda.run();
        }
    }
}
