// Converted from C++ to Java
import java.util.*;

public class Divisors {


     public static void printDivisors(int n)
    {
    	for(int i=1; i i <= n; i++)
    	{
    		if(n % i == 0)
    		{
    			System.out.print(String.valueOf(i) + " ");


    			if(i != (n / i))
    				System.out.print(String.valueOf((n / i)) + " ");
    		}
    	}
    }

    public static void main(String[] args) {

        	int n = 25;

        	printDivisors(n);

        	// (return 0 removed - Java main is void)
    }
}

