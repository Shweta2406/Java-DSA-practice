// Converted from C++ to Java
import java.util.*;

public class SpiralMatrixTraversal {



    const int R = 4, C = 4;

    public static void printSpiral(int mat[4][4], int R, int C)
    {
    	int top = 0, left = 0, bottom = R - 1, right = C - 1;

    	while(top <= bottom && left <= right)
    	{
    		for(int i = left; i <= right; i++)
    			System.out.print(String.valueOf(mat[top][i]) + " ");

    		top++;

    		for(int i = top; i <= bottom; i++)
    			System.out.print(String.valueOf(mat[i][right]) + " ");

    		right--;

    		if(top <= bottom){
    		for(int i = right; i >= left; i--)
    			System.out.print(String.valueOf(mat[bottom][i]) + " ");

    		bottom--;
    		}

    		if(left <= right){
    		for(int i = bottom; i >= top; i--)
    			System.out.print(String.valueOf(mat[i][left]) + " ");

    		left++;
    		}			
    	}
    }

    public static void main(String[] args)
    {	
    	int arr[R][C] = {{1, 2, 3, 4},
    				    {5, 6, 7, 8},
    				    {9, 10, 11, 12},
    				    {13, 14, 15, 16}};

      printSpiral(arr, R, C);

    	// (return 0 removed - Java main is void)
    }
}
