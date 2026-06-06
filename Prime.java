// Converted from C++ to Java
import java.util.*;

public class Prime {

    public static void main(String[] args)
    {
        int n,flag;
        System.out.print("enter the number=");
        n = scanner.nextInt();
        if(n==1)
        System.out.print("neither prime nor composite");
        if(n==2)
        System.out.print("only even prime number");
       for(int i=2;i<n;i++)
       {
            if(n%i==0)
            {
                flag=1;
            }
       }
       if(flag==1)
       System.out.print("not prime");
       else
       System.out.print("prime");
    }
}
