// Interface
interface Shape {
    void displaySides(); // Abstract method declaration
}

class Triangle implements Shape {
    // Implementing the displaySides method from the Shape interface
    public void displaySides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Square implements Shape {
    // Implementing the displaySides method from the Shape interface
    public void displaySides() {
        System.out.println("Square has 4 sides");
    }
}

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Square square = new Square();
      
        triangle.displaySides();
        square.displaySides();
    }
}
