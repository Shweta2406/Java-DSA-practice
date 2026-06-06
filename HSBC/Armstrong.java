// Converted from C++ to Java
import java.util.*;

public class Armstrong {

    public static void main(String[] args)
    {
        int num;
        num = scanner.nextInt();
        int n=num;
        int res=0;
        while(n>0)
        {
            int rem=n%10;
            res+=rem remrem;
            n/=10;
        }
        if(res==num)
        {
            System.out.print("Armstrong no");
        }
        else
        {
            System.out.print("no");
        }
        // (return 0 removed - Java main is void)
    }
}

