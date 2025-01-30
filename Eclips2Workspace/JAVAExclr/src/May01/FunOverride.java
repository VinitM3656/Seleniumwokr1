package May01;

class Nokia {
    void setMic() {
        System.out.println("Mic is set successfully");
    }

    void setKey() {
        System.out.println("Keypad set successfully");
    }
}

class Nokia2 extends Nokia {
    void setMic() {
        System.out.println("Mic has been set");
    }
}

public class FunOverride {
    public static void main(String[] args) {
        Nokia2 N1 = new Nokia2();
        N1.setMic();
    }
}
