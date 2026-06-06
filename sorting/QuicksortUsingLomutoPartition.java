// Converted from C++ to Java
import java.util.*;

public class QuicksortUsingLomutoPartition {


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

    public static void qSort(int[] arr,int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {

        int[] arr={8,4,7,9,3,10,5};

    	int n=sizeof(arr)/sizeof(arr[0]);

    	qSort(arr,0,n-1);

    	for(int x: arr)
    	    System.out.print(String.valueOf(x) + " ");
    }
}
