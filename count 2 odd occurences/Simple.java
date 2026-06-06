// Converted from C++ to Java
import java.util.*;

public class Simple {


    public static void oddAppearing(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count % 2 != 0)
                System.out.print(String.valueOf(arr[i]) + " ");

        }

    }

    public static void main(String[] args) {

    	int[] arr= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;

        oddAppearing(arr, n);

    }
}
