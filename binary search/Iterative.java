// Converted from C++ to Java
import java.util.*;

public class Iterative {



    public static int bSearch(int[] arr, int n, int x)
    {
    	int low = 0, high = n - 1;

    	while(low <= high)
    	{
    		int mid = (low + high) / 2;

    		if(arr[mid] == x)
    			return mid;

    		else if(arr[mid] > x)
    			high = mid - 1;

    		else
    			low = mid + 1;
    	}

    	return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60}, n = 6;

    	int x = 10;

    	System.out.print(bSearch(arr, n, x));
    	// (return 0 removed - Java main is void)
    }
}
