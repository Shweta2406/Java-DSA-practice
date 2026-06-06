// Converted from C++ to Java
import java.util.*;

public class Star {


    public static void main(String[] args)
    {
    int n;
    n = scanner.nextInt();
    int spaces=0;
    int star=n;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<spaces;j++)
        {
            System.out.print(" ");
        }
         for(int j=0;j<star;j++)
        {
            System.out.print("*");
        }
        spaces++;
        star--;
        System.out.println();
    }
    // (return 0 removed - Java main is void)
    }
}
