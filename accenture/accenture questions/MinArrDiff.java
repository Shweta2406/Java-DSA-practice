// Converted from C++ to Java
import java.util.*;

public class MinArrDiff {

    //absolute difference between num and a[i] should be <= diff
    public static int min_diff(int n,int[] a,int diff,int num)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(Math.abs(a[i]-num)<=diff)
            {
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
        int diff;
        diff = scanner.nextInt();
        int num;
        num = scanner.nextInt();
        System.out.print(min_diff(n,a,diff,num));
        // (return 0 removed - Java main is void)
    }
}
