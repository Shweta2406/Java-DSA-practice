// Converted from C++ to Java
import java.util.*;

public class Frequency {



    public static void printFreq(int[] a, int n)
    {
    	int freq=1;
        for(int i=0;i<n;i++)
        {
            while(i < n && a[i] == a[i - 1])
    		{
    			freq++;
    			i++;
    		}

            System.out.println(String.valueOf(a[i-1]) + " " + String.valueOf(freq));
            freq=1;

        }
        if(n==1 ||a[n-1]!=a[n-2])
        System.out.print(String.valueOf(a[n-1]) + " " + String.valueOf(1));


    }


    public static void main(String[] args) 
    {

          int[] arr = {10, 10, 20, 30, 30, 30}, n = 6;

          printFreq(arr, n);

    }
}
