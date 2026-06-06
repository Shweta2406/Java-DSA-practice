// Converted from C++ to Java
import java.util.*;

public class PeakElement {

    //Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.

    // Note: If the array is increasing then just print the last element will be the maximum value.

    // Example:

    // Input: array[]= {5, 10, 20, 15}
    // Output: 20
    // Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.


    public static int peak(int n,int[] arr)
    {
        if(n==0)
        // (return 0 removed - Java main is void)

        if(arr[0]>=arr[1])
        return arr[0];

        if(arr[n-1]>=arr[n-2])
        return arr[n-1];

        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>=arr[i-1] && arr[i+1]<=arr[i])
            {
                return arr[i];
            }
        }
    }

    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();
        int arr[n];
        for(int i=0;i<n;i++)
        {
            arr = scanner.nextInt()[i];
        }
        System.out.print(peak(n,arr));
    }
}
