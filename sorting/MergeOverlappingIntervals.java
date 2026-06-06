// Converted from C++ to Java
import java.util.*;

public class MergeOverlappingIntervals {




    class Interval 
    { 
        int s, e; 
    }; 

    public static boolean mycomp(Interval a, Interval b)  
    { return a.s < b.s; }

    public static void mergeIntervals(Interval arr[], int n)  
    {  
        sort(arr, arr+n, mycomp);  

        int res = 0;  

        for (int i=1; i<n; i++)  
        {  
            if (arr[res].e >=  arr[i].s)  
            {   
                arr[res].e = Math.max(arr[res].e, arr[i].e);  
                arr[res].s = Math.min(arr[res].s, arr[i].s);  
            }  
            else { 
                res++; 
                arr[res] = arr[i];  
            }     
        }  

        for (int i = 0; i <= res; i++)  
            System.out.print("[" + String.valueOf(arr[i].s) + ", " + String.valueOf(arr[i].e) + "] ");
    } 

    public static void main(String[] args) 
    { 
        Interval arr[] =  { {5,10}, {3,15}, {18,30}, {2,7} }; 
        int n = sizeof(arr)/sizeof(arr[0]); 
        mergeIntervals(arr, n); 

        // (return 0 removed - Java main is void) 
    } 
}

