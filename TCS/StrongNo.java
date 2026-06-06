// Converted from C++ to Java
import java.util.*;

public class StrongNo {


    //strong no is whose sum of factorial of digits is equal to given no
    //n=145
    //1!+4!+5!=145
    public static int fact(int n)
    {
        if(n<=1)
        return 1;

        return n fact(n-1);
    }

    public static void main(String[] args)
    {
        int num;
        num = scanner.nextInt();
        int sum=0;
        int n=num;
        while(n)
        {
            int rem=n%10;
            sum+=fact(rem);
            n/=10;
        }
        if(sum==num)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}

