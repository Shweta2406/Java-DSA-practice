// Converted from C++ to Java
import java.util.*;

public class RangeOfPrimeNo {


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
       int n;
       int flag;

       System.out.print("Enter range: ");
       n = scanner.nextInt();

       System.out.println("Prime numbers between 1 and " + String.valueOf(n) + " are: ");

       // Loop through all numbers from 2 to n
       for (int i = 2; i <= n; i++) {
          flag=0;

          // Check if i is divisible by any number less than i
          for (int j = 2; j < i; j++) {
             if (i % j == 0) {
                flag=1;
                break;
             }
          }

          // Print i if it is prime
          if (flag==0) {
             System.out.println(i);
          }
       }

       // (return 0 removed - Java main is void)
    }

}
