package May01;

public class Rectangle {
    int length;
    int width;

    void setData(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println("Length is " + this.length);
        System.out.println("Width is " + this.width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Renamed the variable to follow naming conventions
        rectangle.setData(23, 32); // Corrected method call syntax
        rectangle.display();
    }
}
