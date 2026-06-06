// Converted from C++ to Java
import java.util.*;

public class Simple {

    public static int power(int n)
    {
    while(n!=1)
        {

            if(n%2!=0)
             return false;
             n=n/2;
        }
            return true;
    }
    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();
        power(n);
        // (return 0 removed - Java main is void)
     }
}
