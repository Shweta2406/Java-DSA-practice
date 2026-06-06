// Converted from C++ to Java
import java.util.*;

public class SieveOfEratosthenesPrimeNo {


     public static void sieve(int n)
    {
    	if(n <= 1)
    		return;

    	boolean isPrime[n+1];

    	fill(isPrime, isPrime + n + 1, true);

    	for(int i=2; i i <= n; i++)
    	{
    		if(isPrime[i])
    		{
    			for(int j = 2*i; j <= n; j = j+i)
    			{
    				isPrime[j] = false;
    			}
    		}
    	}

    	for(int i = 2; i<=n; i++)
    	{
    		if(isPrime[i])
    			System.out.print(String.valueOf(i) + " ");
    	}
    }
    public static void main(String[] args) {

        	int n = 18;

    		sieve(n);
    }
}

