// Converted from C++ to Java
import java.util.*;

public class AlternateSort {

    int alternate_sort(int arr,int n)
    {
        Arrays.sort(arr, 0, n);

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            System.out.print(String.valueOf(arr[i]) + " ");
        }
        return arr;
    }
    public static void main(String[] args)
    {
    int n;
    n = scanner.nextInt();
    int a[n];
    for(int i=0;i<n;i++)
    {
        a = scanner.nextInt()[i];
    }
    int p=alternate_sort(a,n);
    // (return 0 removed - Java main is void)
    }
}

