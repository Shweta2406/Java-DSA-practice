// Converted from C++ to Java
import java.util.*;

public class RemoveDuplicates {



    public static void main(String[] args) {

          int[] arr = {10, 20, 20, 30, 30, 30}, n = 6;

          System.out.println("Before Removal");

           for(int i = 0; i < n; i++)
           {
           		System.out.print(String.valueOf(arr[i]) + " ");
           }

           System.out.println();


           System.out.println("After Removal");

           for(int i = 0; i < n; i++)
           {
               if(arr[i]==arr[i+1])
               continue;
           		System.out.print(String.valueOf(arr[i]) + " ");
           }

    }
}
