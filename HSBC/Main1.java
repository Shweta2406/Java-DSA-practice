// Converted from C++ to Java
import java.util.*;

public class Main1 {

     public static void main(String[] args)
     {
        int n;
        n = scanner.nextInt();
        int arr1[n],arr2[n];
        for(int i=0;i<n;i++)
        {
            arr1 = scanner.nextInt()[i];
        }
        for(int i=0;i<n;i++)
        {
            arr2 = scanner.nextInt()[i];
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {

                sum+=arr1[i]*arr2[n-1-i];


        }
        System.out.print(sum);
        // (return 0 removed - Java main is void)
     }
}
