// Converted from C++ to Java
import java.util.*;

public class Count1s {

    //count 1 in sorted binary array
    public static int countOnes(int[] arr, int n)
    {
    	int low = 0, high = n - 1;

    	while(low <= high)
    	{
    		int mid = (low + high) / 2;

    		if(arr[mid] == 0)
    			low = mid + 1;
    		else
    		{
    			if(mid == 0 || arr[mid - 1] == 0)
    				return (n - mid);
    			else 
    				high = mid -1;
    		}
    	}

    	// (return 0 removed - Java main is void)		
    }

    public static void main(String[] args) {

       int[] arr = {0, 0, 1, 1, 1, 1}, n = 6;

       System.out.print(countOnes(arr, n));

    	// (return 0 removed - Java main is void)
    }
}
