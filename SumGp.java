// Converted from C++ to Java
import java.util.*;

public class SumGp {


    public static int sum_gp(int a,int r,int n)
    {
        int sum=a(((int)Math.pow(r,n)-1)/(r-1));
        return sum;
    }
    public static void main(String[] args)
    {
        int a,r,n;

        a = scanner.nextInt()>>r>>n;
        int o=sum_gp(a,r,n);
        System.out.print("sum of n terms who are in gp is " + String.valueOf(o));
        // (return 0 removed - Java main is void)
    }

}

