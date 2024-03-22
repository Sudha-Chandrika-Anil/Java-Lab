import java.util.Scanner;

public class MatrixTran {
    
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = s.nextInt();
        int cols = s.nextInt();

        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int[][] transposeMatrix = findTranspose(matrix);

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
        }
        catch(Exception e) {
            System.out.println("Error: "+ e);
        }
    }
}

