// Converted from C++ to Java
import java.util.*;

public class FirstDigit {


    public static void main(String[] args)
    {
    int n;
    System.out.print("enter number: ");
    n = scanner.nextInt();
    while(n>10)
    {
        n=n/10;
    }
    System.out.println(n);
    // (return 0 removed - Java main is void)
    }
}
