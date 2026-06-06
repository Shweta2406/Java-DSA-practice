// Converted from C++ to Java
import java.util.*;

public class MatrixMultiplication {


    public static void main(String[] args){

    int M = 2, N = 2, P = 2;
    int m1[M][N] = { { 5, 6 },
                      { 8, 9 } };
    int m2[N][P] = { { 1, 2 },
                      { 4, 5 } };
    int ans[M][P];

    // Traversing number of Rows
    for(int i = 0; i < M; i++) 
    {   
        // Traversing number of Columns  
        for (int j = 0; j < P; j++) 
        { 
            ans[i][j] = 0;

            for( int k = 0; k < N; k++ )
                ans[i][j] += m1[i][k] * m2[k][j];
        } 
    }

    for (int i = 0; i < N; i++) 
    {    
        for (int j = 0; j < M; j++) 
        { 
            System.out.print(String.valueOf(ans[i][j]) + " ");
        } 
        System.out.println();
     }

    }
}
