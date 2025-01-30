package May01;

abstract class USA {
    int x;
    int y;

    USA() {
        x = 10;
        y = 19;
    }

    void fun1() {
        System.out.println("fun is executed");
    }

    abstract class UK extends USA {
        abstract void fun2();
    }
}

public class abstract2 {
    public static void main(String[] args) {
        // You can't instantiate an abstract class, so you need to create a concrete subclass
        USA.UK u1 = new USA().new UK() {
            @Override
            void fun2() {
                System.out.println("override fun2 executed");
            }
        };
        u1.fun2();
    }
}
