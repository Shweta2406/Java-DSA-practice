// Converted from C++ to Java
import java.util.*;

public class Binarysearch {

    public static int binary(int[] arr,int n,int x)
    {
      int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
             return mid;
            else if(arr[mid]>x)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    	// your code goes here
        int n;
        n = scanner.nextInt();
        int arr[n];
        for(int i=0;i<n;i++)
        arr = scanner.nextInt()[i];

       int x;
       x = scanner.nextInt();
       int q=binary(arr,n,x);
       System.out.print(String.valueOf(x) + " is present at location " + String.valueOf(q));

    	// (return 0 removed - Java main is void)
    }

}
