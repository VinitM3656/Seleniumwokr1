package May01;

class USA {
    static void fun1() {
        System.out.println("fun 1 executed");
    }

    static void fun2() {
        System.out.println("fun 2 executed");
    }

    void fun3() {
        System.out.println("fun 3 executed");
    }
}

public class Example {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;
        char z = 'c';
        System.out.println(x + " " + y + " " + z);
        USA.fun2();
    }
}
