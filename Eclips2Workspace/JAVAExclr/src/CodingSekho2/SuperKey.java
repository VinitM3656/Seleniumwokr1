package CodingSekho2;

class India {
    int x, y;
}

class Ukrain extends India {
    int x, y;

    void setData(int p, int q) {
        super.x = p;
        super.y = q;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(super.y);
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Ukrain u1 = new Ukrain();
        u1.setData(23, 23);
        u1.display();
    }
}
