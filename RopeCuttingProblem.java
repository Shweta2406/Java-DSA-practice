// Converted from C++ to Java
import java.util.*;

public class RopeCuttingProblem {



    public static int maxCuts(int n, int a, int b, int c)
    {
    	if(n == 0)
    		// (return 0 removed - Java main is void)
    	if(n <= -1)
    		return -1;

    	int res = Math.max(maxCuts(n-a, a, b, c), 
    	          Math.max(maxCuts(n-b, a, b, c), 
    	          maxCuts(n-c, a, b, c)));

    	if(res == -1)
    		return -1;

    	return res + 1; 
    }
    public static void main(String[] args) {

    	int n = 5, a = 2, b = 1, c = 5;

    	System.out.print(maxCuts(n, a, b, c));

    	// (return 0 removed - Java main is void)
    }
}
