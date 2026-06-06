// Converted from C++ to Java
import java.util.*;

public class PalindromeNo {

    public static void main(String[] args)
    {
        int num,n,rem,rev=0;
        System.out.print("enter number: ");
        num = scanner.nextInt();
        n=num;
        while(n>0)
        {
            rem=n%10;
            rev=(rev10)+rem;
            n=n/10;
        }
        if(num==rev)
        System.out.print("palindrome");
        else
        System.out.print("not palindrome");
        // (return 0 removed - Java main is void)
    }
}

