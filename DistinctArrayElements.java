// Converted from C++ to Java
import java.util.*;

public class DistinctArrayElements {

    //count distinct array elements

    public static int count_distinct(int[] a,int n)
    {
        int count=0;
        boolean distinct=true;
        for(int i=0;i<n;i++)
        {
            distinct=true;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]==a[i])
                {
                    distinct=false;
                    break;
                }
            }
                if(distinct==true)
                count++;

            }
            return count;
        }


    public static void main(String[] args)
    {
    int n;
    System.out.print("enter no of elements: ");
    n = scanner.nextInt();
    int a[n];
    System.out.print("enter array elements: ");
    for(int i=0;i<n;i++)
    a = scanner.nextInt()[i];

    System.out.print(count_distinct(a,n));
    // (return 0 removed - Java main is void)
    }
}
