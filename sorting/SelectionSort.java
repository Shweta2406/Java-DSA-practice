// Converted from C++ to Java
import java.util.*;

public class SelectionSort {


    public static void selectionSort(int[] arr, int n){

        for(int i = 0; i < n; i++){
            int min_ind = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            { int _t = arr[i]; arr[i] =  arr[min_ind];  arr[min_ind] = _t; };
        }


    }

    public static void main(String[] args) {
    	int[] a = {2, 1, 3, 4};
    	selectionSort(a, 4);
    	for(int i = 0;i < 4; i++){
    	    System.out.print(String.valueOf(a[i]) + " ");
    	}
    	// (return 0 removed - Java main is void)
    }
}
