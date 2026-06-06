// Converted from C++ to Java
import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        int n;
        System.out.print("enter no. of elements");
        n = scanner.nextInt();
        int a=0,b=1,c;
        System.out.print(a);
        System.out.print(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);

        }

    }


    // // // int fibo(int n)
    // {
    //     if(n<2)
    //     return n;
    // return fibo(n-1)+fibo(n-2);
    // }
    // public static void main(String[] args)
    // {
    // int n;
    // cout<<"enter no:";
    // n = scanner.nextInt();
    // cout<<fibo(n);
    // return 0;
    // }

}
