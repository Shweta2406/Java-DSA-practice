// Converted from C++ to Java
import java.util.*;

public class ReverseNo {

    public static void main(String[] args)
    {
        int n,remender,rev=0;
        System.out.print("enter no. :");
        n = scanner.nextInt();
        while(n>0)
        {
            remender=n%10;
            rev=rev10+remender;
            n=n/10;
        }
        System.out.print("reverse of number :" + String.valueOf(rev));

        // (return 0 removed - Java main is void)}
}

