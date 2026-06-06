// Converted from C++ to Java
import java.util.*;

public class RowwiseSorting {

    static final int M = 4;   // replaced #define M 4
    static final int N = 4;   // replaced #define N 4

    public static void sortRowWise(int[][] m) {
        // Sort each row individually
        for (int i = 0; i < M; i++) {
            Arrays.sort(m[i]);   // replaced C++ std::sort(m[i], m[i]+N)
        }

        // Print the sorted matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m = {
            {9, 8, 7, 1},
            {7, 3, 0, 2},
            {9, 5, 3, 2},
            {6, 3, 1, 2}
        };
        sortRowWise(m);
    }
}
