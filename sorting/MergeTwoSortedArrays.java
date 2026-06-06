// Converted from C++ to Java
import java.util.*;

public class MergeTwoSortedArrays {


    public static void merge(int[] a, int[] b, int m, int n){

        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(String.valueOf(a[i++]) + " ");
            else
                System.out.print(String.valueOf(b[j++]) + " ");
        }
        while(i<m)
            System.out.print(String.valueOf(a[i++]) + " ");
        while(j<n)
            System.out.print(String.valueOf(b[j++]) + " ");
    }

    public static void main(String[] args) {

        int[] a={10,15,20,40};
        int[] b={5,6,6,10,15};

    	int m=sizeof(a)/sizeof(a[0]);
    	int n=sizeof(b)/sizeof(b[0]);
    	merge(a,b,m,n);
    }
}
