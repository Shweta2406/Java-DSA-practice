// Converted from C++ to Java
import java.util.*;

public class GcdAndLcm {


     public static int gcd(int a, int b)
    {
    	if(b==0)
    		return a;

    	return gcd(b, a % b); //euclidean method
    }
    public static int gcd_array(int[] a,int n)
    {
    	int result=a[0];
    	for(int i=1;i<n;i++)
    	{
    		result=gcd(result,a[i]);
    		if(result==1)
    		return 1;
    	}
    	return result;
    }
    public static int lcm(int a,int b)
    {
        int lcm=(a b)/gcd(a,b);
        return lcm;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        	int a = 12, b = 15;

        	int[] arr={10,20,30,40};
    		int n=sizeof(arr)/sizeof(arr[0]);
    		for(int i=0;i<n;i++)
    		{
               arr = scanner.nextInt()[i];
    		}
        	System.out.println("GCD: " + String.valueOf(gcd(a, b)));
            System.out.print("LCM :" + String.valueOf(lcm(a,b)));
    		System.out.print("GCD OF ARRAYS: " + String.valueOf(gcd_array(arr,n)));

        	// (return 0 removed - Java main is void)
    }
}

