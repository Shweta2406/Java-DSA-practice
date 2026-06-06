// Converted from C++ to Java
import java.util.*;

public class Leader {



    public static void leaders(int[] arr, int n)
    {
    	int curr_ldr = arr[n - 1];

    	System.out.print(String.valueOf(curr_ldr) + " ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(String.valueOf(curr_ldr) + " ");
    		}
    	}
    }



    public static void main(String[] args) {

          int[] arr = {7, 10, 4, 10, 6, 5, 2}, n = 7;

          leaders(arr, n);

    }
}
