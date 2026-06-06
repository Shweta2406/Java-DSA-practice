// Converted from C++ to Java
import java.util.*;

public class PrimeFactors {

    public static int isprime(int n)
    {
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
           return false;
           }
       }
       return true;
    }

    public static void prime_factor(int n)
    {

            for(int i=2;i<n;i++)
            {
                 if(isprime)
                  {
                    int x=i;
                    while(n%x==0)
                    {
                    System.out.print(String.valueOf(i) + " ");
                    x=x i;
                    }
                  }
            }
    }


    public static void main(String[] args)
    {
       System.out.print("enter number: ");
       int n;
       n = scanner.nextInt();
       prime_factor(n);
       // (return 0 removed - Java main is void)
    }
}

