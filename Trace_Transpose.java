import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the number of rows and columns of the matrix
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = s.nextInt();
        int c = s.nextInt();

        // Input elements 
        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int trace = 0;
        for (int i = 0; i < Math.min(r, c); i++) {
            trace += matrix[i][i];
        }

        // Print the trace 
        System.out.println("Trace of the matrix: " + trace);

        // Calculate transpose 
        int[][] transpose = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < co; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
