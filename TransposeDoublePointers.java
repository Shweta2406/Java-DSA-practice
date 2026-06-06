import java.util.*;

public class TransposeDoublePointers {

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element at position (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedArray = transposeMatrix(matrix);

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

