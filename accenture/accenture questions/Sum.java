// Converted from C++ to Java
import java.util.*;

public class Sum {


    public static void main(String[] args)
    {
    int arr[5]={1,5,7,-1,5};
    int sum=6;
     for(int i=0;i<5;i++)
     {
         for(int j=i+1;j<5;j++)
         {
             if((arr[i]+arr[j])==sum)
             {
                 System.out.println("(" + String.valueOf(arr[i]) + "," + String.valueOf(arr[j]) + ")");
             }
         }
     }
    // (return 0 removed - Java main is void)
    }
}
