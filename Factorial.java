// Converted from C++ to Java
import java.util.*;

public class Factorial {

    public static int factorial(int n)
    {
        if(n<=1)
        return 1;
    return n factorial(n-1);
    }
    public static void main(String[] args)
    {
    int n;
    System.out.print("enter no:");
    n = scanner.nextInt();
    System.out.print(factorial(n));
    // (return 0 removed - Java main is void)
    }
}

