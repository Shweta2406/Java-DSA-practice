// Converted from C++ to Java
import java.util.*;

public class MatrixTranspose {


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter the number of rows and columns of the matrix: ");
        rows = scanner.nextInt() >> cols;

        int matrix[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix = scanner.nextInt()[i][j];
            }
        }

        System.out.println("The original matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(String.valueOf(matrix[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(String.valueOf(matrix[j][i]) + " ");
            }
            System.out.println();
        }

        // (return 0 removed - Java main is void)
    }
}
