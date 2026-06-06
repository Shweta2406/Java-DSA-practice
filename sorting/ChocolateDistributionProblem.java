// Converted from C++ to Java
import java.util.*;

public class ChocolateDistributionProblem {


    public static int minDiff(int[] arr,int n,int m){
        if(m>n)
            return -1;
        Arrays.sort(arr, 0, n);
        int res=arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<n;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }

    public static void main(String[] args) {

        int[] arr={7,3,2,4,9,12,56};

    	int n=sizeof(arr)/sizeof(arr[0]);int m=3;

    	System.out.print(minDiff(arr,n,m));
    }
}
