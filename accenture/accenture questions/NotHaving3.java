// Converted from C++ to Java
import java.util.*;

public class NotHaving3 {


    public static int not_having_3(int n)
    {

        while(n)
        {
            int rem=n%10;
            if(rem==3)
            {
                // (return 0 removed - Java main is void)
            }
            n=n/10;

        }
        return 1;
    }

    public static void range(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(not_having_3(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args)
    {
    int n;
    n = scanner.nextInt();
    range(n);
    // (return 0 removed - Java main is void)
    }
}
