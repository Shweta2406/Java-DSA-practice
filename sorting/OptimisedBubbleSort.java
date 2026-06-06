// Converted from C++ to Java
import java.util.*;

public class OptimisedBubbleSort {


    public static void bubbleSort(int[] arr, int n){

        boolean swapped;
        for(int i = 0;i < n; i++){

            swapped = false;
            for(int j = 0 ; j < n - i -1; j++){
                if( arr[j] > arr[j+1]){
                    { int _t = arr[j]; arr[j] =  arr[j+1];  arr[j+1] = _t; };
                    swapped = true;
                }
            }

            if( swapped == false)
            break;
        }
    }

    public static void main(String[] args) {
    	int[] a = {2, 1, 3, 4};
    	bubbleSort(a, 4);
    	for(int i = 0; i < 4; i++){
    	    System.out.print(String.valueOf(a[i]) + " ");
    	}
    	// (return 0 removed - Java main is void)
    }
}
