// Converted from C++ to Java
import java.util.*;

public class Divisible90 {

    // CPP program to find largest number
    // divisible by 90 that can be made
    // using 0 and 5
    public static void divisible_by_90(int n,int[] a)
    {
        int c0=0,c5=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            c0++;
            else
            c5++;
        }
        c5=(int)Math.floor(c5/9)*9;
        if(c0==0)
        System.out.println(-1);
        else if(c5==0)
        System.out.println(0);
        else{
            for(int i=0;i<c5;i++)
            {
                System.out.print(5);
            }
             for(int i=0;i<c0;i++)
            {
                System.out.print(0);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a={5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5};
        int n=sizeof(a)/sizeof(a[0]);
        divisible_by_90(n,a);
        // (return 0 removed - Java main is void)
    }
}
