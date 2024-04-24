public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Test addition methods
        System.out.println("Sum of 3 and 5: " + calculator.add(3, 5));
        System.out.println("Sum of 3, 5, and 7: " + calculator.add(3, 5, 7));
        System.out.println("Sum of 3.5 and 4.5: " + calculator.add(3.5, 4.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + calculator.add("Hello", "World"));

        // Test multiplication methods
        System.out.println("Product of 3 and 5: " + calculator.multiply(3, 5));
        System.out.println("Product of 2, 4, and 6: " + calculator.multiply(2, 4, 6));
    }
}
