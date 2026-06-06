// Converted from C++ to Java
import java.util.*;

public class Closet0s1sAnd2s {


    public static void sort(int[] arr,int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    { int _t = arr[l]; arr[l] = arr[mid]; arr[mid] = _t; };
                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    { int _t = arr[h]; arr[h] = arr[mid]; arr[mid] = _t; };
                    h--;
                    break;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr={0,1,1,2,0,1,1,2};

    	int n=sizeof(arr)/sizeof(arr[0]);

    	sort(arr,n);

    	for(int x:arr)
    	    System.out.print(String.valueOf(x) + " ");
    }
}
