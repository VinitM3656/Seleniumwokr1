package May01;

class India {
    int x, y;
}

class Ukrain extends India {
    void setData(int p, int q) {
        x = p; // Assigning values to the variables of the superclass directly
        y = q;
    }

    void display() {
        System.out.println(x); // Accessing variables of the superclass directly
        System.out.println(y);
    }
}

public class Super1 {
    public static void main(String[] args) {
        Ukrain u1 = new Ukrain();
        u1.setData(34, 34);
        u1.display();
    }
}
