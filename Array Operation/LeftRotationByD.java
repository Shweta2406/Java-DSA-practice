// Converted from C++ to Java
import java.util.*;

public class LeftRotationByD {



    public static void reverse(int[] arr, int low, int high)
    {
    	while(low < high)
    	{
    		{ int _t = arr[high]; arr[high] =  arr[low];  arr[low] = _t; };

    		low++;
    		high--;
    	}
    }   

    public static void leftRotate(int[] arr, int d, int n)
    {
    	reverse(arr, 0, d - 1);

    	reverse(arr, d, n - 1);

    	reverse(arr, 0, n - 1);
    }



    public static void main(String[] args) {

          int[] arr = {1, 2, 3, 4, 5}, n = 5, d = 2;

          System.out.println("Before Rotation");

           for(int i = 0; i < n; i++)
           {
           		System.out.print(String.valueOf(arr[i]) + " ");
           }

           System.out.println();

           leftRotate(arr, d, n);

           System.out.println("After Rotation");

           for(int i = 0; i < n; i++)
           {
           		System.out.print(String.valueOf(arr[i]) + " ");
           }

    }
}
