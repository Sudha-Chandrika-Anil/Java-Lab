import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter coefficients of the quadratic equation (a, b, c):");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the quadratic equation are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots of the quadratic equation are real and equal:");
            System.out.println("Root: " + root);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots of the quadratic equation are complex:");
            System.out.println("Root 1: " + real+ " + " + imaginary + "i");
            System.out.println("Root 2: " + real + " - " + imaginary + "i");
        }
    }
}

