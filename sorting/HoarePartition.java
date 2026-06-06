// Converted from C++ to Java
import java.util.*;

public class HoarePartition {


    public static int partition(int[] arr, int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            { int _t = arr[i]; arr[i] = arr[j]; arr[j] = _t; };
        }
    }

    public static void main(String[] args) {

        int[] arr={5,3,8,4,2,7,1,10};

    	int n=sizeof(arr)/sizeof(arr[0]);

    	partition(arr,0,n-1);

    	for(int x: arr)
    	    System.out.print(String.valueOf(x) + " ");
    }
}
