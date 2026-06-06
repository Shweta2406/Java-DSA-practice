// Converted from C++ to Java
import java.util.*;

public class CountFreqUsingMaps {

    // CPP program to count frequencies of array items

    public static void countFreq(int[] arr, int n)
    {
    	HashMap<int, int> mp;

    	// Traverse through array elements and
    	// count frequencies
    	for (int i = 0; i < n; i++)
    		mp[arr[i]]++;

    	// Traverse through map and print frequencies
    	for (Integer x : mp)
    		System.out.println(String.valueOf(x.first) + " " + String.valueOf(x.second));
    }

    public static void main(String[] args)
    {
    	int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
    	int n = sizeof(arr) / sizeof(arr[0]);
    	countFreq(arr, n);
    	// (return 0 removed - Java main is void)
    }

}

