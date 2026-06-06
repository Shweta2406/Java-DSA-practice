// Converted from C++ to Java
import java.util.*;

public class Fibonacci {

    public static void main(String[] args)
    {
        int a=0,b=1,c=0,n;
        System.out.println("enter no. of elements in fibonacci series");
        n = scanner.nextInt();
        System.out.println("fibonacci series is" + String.valueOf(endl) + String.valueOf(a) + String.valueOf(endl) + String.valueOf(b));
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
