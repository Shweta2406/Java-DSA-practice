// Converted from C++ to Java
import java.util.*;

public class LomutoPartition {


    public static int iPartition(int[] arr, int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                { int _t = arr[i]; arr[i] = arr[j]; arr[j] = _t; };
            }
        }
        { int _t = arr[i+1]; arr[i+1] = arr[h]; arr[h] = _t; };
        return i+1;
    }

    public static void main(String[] args) {

        int[] arr={10,80,30,90,40,50,70};

    	int n=sizeof(arr)/sizeof(arr[0]);

    	iPartition(arr,0,n-1);

    	for(int x: arr)
    	    System.out.print(String.valueOf(x) + " ");
    }
}
