// Converted from C++ to Java
import java.util.*;

public class InsertionSort {


    public static void iSort(int[] arr,int n){

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

        int[] arr={50,20,40,60,10,30};

    	int n=sizeof(arr)/sizeof(arr[0]);
    	iSort(arr,n);

    	for(Integer x: arr)
    	    System.out.print(String.valueOf(x) + " ");
    }
}

