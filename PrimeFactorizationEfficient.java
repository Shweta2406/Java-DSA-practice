// Converted from C++ to Java
import java.util.*;

public class PrimeFactorizationEfficient {


     public static void printPrimeFactors(int n)
    {
    	if(n <= 1)
    		return;

    	for(int i=2; i i<=n; i++)
    	{
    		while(n % i == 0)
    		{
    			System.out.print(String.valueOf(i) + " ");

    			n = n / i;
    		}
    	}

    	if(n > 1)
    		System.out.print(String.valueOf(n) + " ");

    	System.out.println();
    }

    public static void main(String[] args) {

        	int n = 450;

        	printPrimeFactors(n);

        	// (return 0 removed - Java main is void)
    }
}

