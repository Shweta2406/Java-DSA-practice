// Converted from C++ to Java
import java.util.*;

public class SquareRoot {


    public static int sqRootFloor(int x)
    {
    	int low = 1, high = x, ans = -1;

    	while(low <= high)
    	{
    		int mid = (low + high) / 2;

    		int mSq = mid mid;

    		if(mSq == x)
    			return mid;
    		else if(mSq > x)
    			high = mid - 1;
    		else
    		{
    			low = mid + 1;
    			ans = mid;
    		}
    	}

    	return ans;
    }

    public static void main(String[] args) {


       System.out.print(sqRootFloor(10));

    	// (return 0 removed - Java main is void)
    }
}

