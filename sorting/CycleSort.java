// Converted from C++ to Java
import java.util.*;

public class CycleSort {




    public static void cycleSortDistinct(int[] arr, int n) 
    { 
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++)
                if(arr[i]<item)
                    pos++;
            { int _t = item; item = arr[pos]; arr[pos] = _t; };
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;
                { int _t = item; item = arr[pos]; arr[pos] = _t; };
            }
        }
    } 

    public static void main(String[] args) 
    { 
        int[] arr = { 20,40,50,10,30 }; 
        int n = sizeof(arr) / sizeof(arr[0]); 
        cycleSortDistinct(arr, n); 

        for (int i = 0; i < n; i++) 
            System.out.print(String.valueOf(arr[i]) + " ");

        // (return 0 removed - Java main is void) 
    } 
}
