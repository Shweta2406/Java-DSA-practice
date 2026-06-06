// Converted from C++ to Java
import java.util.*;

public class GreaterThanPrior {


    //count elements in array which are greater than all its prior elements
    public static int greater_(int n,int[] a)
    {
         int count=1;
         int maxi=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>maxi)
            {
            maxi=a[i];
            count++;
            }

        }

        return count;
    }

    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();

        int a[n];
        for(int i=0;i<n;i++)
        {
            a = scanner.nextInt()[i];
        }
        int x=greater_(n,a);
        System.out.print(x);
        // (return 0 removed - Java main is void)

    }
}
