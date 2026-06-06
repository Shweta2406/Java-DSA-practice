// Converted from C++ to Java
import java.util.*;

public class MaximumGuest {




    public static int maxGuest(int[] arr,int[] dep,int n)  
    {  
        Arrays.sort(arr, 0, n);
        Arrays.sort(dep, 0, n);

        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(curr,res);
        }
       return res;
    } 

    public static void main(String[] args) 
    { 
        int[] arr = { 900, 600, 700};
        int[] dep = { 1000, 800, 730};
        int n = sizeof(arr)/sizeof(arr[0]); 

        System.out.print(maxGuest(arr,dep, n));

        // (return 0 removed - Java main is void) 
    } 
}
