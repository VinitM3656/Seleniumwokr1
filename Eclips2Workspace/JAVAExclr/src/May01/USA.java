package May01;

class USA {
    private int x, y;

    void setData(int p, int q) {
        x = p;
        y = q;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class Demo {
    public static void main(String args[]) {
        USA a1 = new USA();
        a1.setData(5, 340);
        USA a2 = new USA();
        a2.setData(34, 34);
        a1.display();
        a2.display();
    }
}
