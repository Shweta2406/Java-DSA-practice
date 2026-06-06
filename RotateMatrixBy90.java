// Converted from C++ to Java
import java.util.*;

public class RotateMatrixBy90 {

    //rotate matrix by 90 degree to right

    public static void main(String[] args)
    {
        int m;
        System.out.print("enter no. of rows and column: ");
        m = scanner.nextInt();

        int mat[m][m];
        System.out.print("enter elements of matrix: \n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat = scanner.nextInt()[i][j];
            }
        }

        //transpose of matrix
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                { int _t = mat[i][j]; mat[i][j] = mat[j][i]; mat[j][i] = _t; };
            }
        }

        //reversing each rows of matrix
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                { int _t = mat[i][j]; mat[i][j] = mat[i][m-1-j]; mat[i][m-1-j] = _t; };
            }
        }

    System.out.println();
    System.out.println("matrix rotated by 90 degree is: ");
        //printing matrix
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(String.valueOf(mat[i][j]) + " ");
            }
            System.out.println();
        }
        // (return 0 removed - Java main is void)

    }
}
