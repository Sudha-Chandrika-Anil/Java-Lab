class Rectangle {
    int length;
    int width;

    // Constructor with parameters
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }


    public int calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 3);

        int area1 = rectangle1.calculateArea();
        System.out.println("Area of rectangle1: " + area1);

        Rectangle rectangle2 = new Rectangle(7, 4);

        int area2 = rectangle2.calculateArea();
        System.out.println("Area of rectangle2: " + area2);
    }
}
