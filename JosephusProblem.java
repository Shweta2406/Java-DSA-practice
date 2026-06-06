// Converted from C++ to Java
import java.util.*;

public class JosephusProblem {

    public static int Josephus_Problem(int n,int k)//n persons in a circular table ,kill every kth person
    {
      if(n==1)
      {
          // (return 0 removed - Java main is void)
      }
      return (Josephus_Problem(n-1,k)+k)%n+1;
    }
    public static void main(String[] args)
    {
        int n,k;
        n = scanner.nextInt()>>k;
      int c=Josephus_Problem(n,k);
      System.out.print(c);
    // (return 0 removed - Java main is void)
    }
}
