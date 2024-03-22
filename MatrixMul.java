import java.util.*;

public class MatrixMul {
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;

        int[][] resultMatrix = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the first matrix:");
        int m1 = s.nextInt();
        int n1 = s.nextInt();
        System.out.println("Enter the number of rows and columns of the second matrix:");
        int m2 = s.nextInt();
        int n2 = s.nextInt();

        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
