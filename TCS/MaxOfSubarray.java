// Converted from C++ to Java
import java.util.*;

public class MaxOfSubarray {

    // C++ program for the above approach


    // Method to find the maximum for each
    // and every contiguous subarray of size K.
    public static void printKMax(int[] arr, int N, int K)
    {
    	int j, max;

    	for (int i = 0; i <= N - K; i++) {
    		max = arr[i];

    		for (j = 1; j < K; j++) {
    			if (arr[i + j] > max)
    				max = arr[i + j];
    		}
    		System.out.print(String.valueOf(max) + " ");
    	}
    }

    // Driver's code
    public static void main(String[] args)
    {
    	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    	int N = sizeof(arr) / sizeof(arr[0]);
    	int K = 3;

    	// Function call
    	printKMax(arr, N, K);
    	// (return 0 removed - Java main is void)
    }

    // This code is contributed by rathbhupendra

}
