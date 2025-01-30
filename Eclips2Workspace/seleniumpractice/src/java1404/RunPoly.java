package java1404;

class Bike {
    void run() {
        System.out.println("Running");
    }
}

class Splender extends Bike {
    @Override
    void run() {
        System.out.println("Running safely with 0km");
    }
}

public class RunPoly {
    public static void main(String[] args) {
        Splender splender = new Splender();
        splender.run();
    }
}
