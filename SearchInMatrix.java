// Converted from C++ to Java
import java.util.*;

public class SearchInMatrix {



    const int R = 4, C = 4;

    public static void search(int mat[R][C], int x)
    {
    	int i  = 0, j = C - 1;

    	while(i < R && j >= 0)
    	{
    		if(mat[i][j] == x)
    		{
    			System.out.print("Found at (" + String.valueOf(i) + ", " + String.valueOf(j) + ")");

    			return;
    		}
    		else if(mat[i][j] > x)
    		{
    			j--;
    		}
    		else
    		{
    			i++;
    		}
    	}

    	System.out.print("Not Found");
    }

    public static void main(String[] args)
    {	
        int[] arr[C] = {{10, 20, 30, 40},
        			   {15, 25, 35, 45},
        			   {27, 29, 35, 45},
        			   {32, 33, 39, 50}};

    	int x = 29;	   

    	search(arr, x);

    	// (return 0 removed - Java main is void)
    }
}
