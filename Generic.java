import java.util.Scanner;

public class Calculator<T extends Number> {
    private Scanner scanner;

    // Constructor
    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    // Method to add two numbers
    public T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }

    // Method to concatenate two strings
    public String concatenate(String a, String b) {
        return a + b;
    }

    // Method to get user input for integer
    public int getIntInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }

    // Method to get user input for double
    public double getDoubleInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Get user input for numbers
        int intInput1 = calculator.getIntInput("Enter an integer");
        int intInput2 = calculator.getIntInput("Enter another integer");
        double doubleInput1 = calculator.getDoubleInput("Enter a double");
        double doubleInput2 = calculator.getDoubleInput("Enter another double");

        // Perform arithmetic operations
        System.out.println("Addition (integers): " + calculator.add(intInput1, intInput2));
        System.out.println("Addition (doubles): " + calculator.add(doubleInput1, doubleInput2));

        // Get user input for strings
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter a string: ");
        String strInput1 = scanner.nextLine();
        System.out.print("Enter another string: ");
        String strInput2 = scanner.nextLine();

        // Perform string concatenation
        System.out.println("Concatenation: " + calculator.concatenate(strInput1, strInput2));

        // Close scanner
        calculator.scanner.close();
    }
}
