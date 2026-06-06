// Converted from C++ to Java
import java.util.*;

public class TowerOfHanoi {


    public static void toh(int n,char A,char B,char C)
    {
        if(n==1)
        {
        System.out.println("Move 1 from " + String.valueOf(A) + " to " + String.valueOf(C));
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("Move " + String.valueOf(n) + " from " + String.valueOf(A) + " to " + String.valueOf(C));
        toh(n-1,B,A,C);

    }

    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();
      toh(n,'A','B','C');
    // (return 0 removed - Java main is void)
    }
}
