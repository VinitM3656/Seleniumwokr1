package java1404;

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class methodOverload {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 12));
        System.out.println(Adder.add(11, 23, 45));
    }
}
