// Converted from C++ to Java
import java.util.*;

public class Searching {

    public static int search(int[] a,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            return 1;
        }
        return -1;
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
    int k;
    System.out.println("enter element to be search:");
    k = scanner.nextInt();
     System.out.print(search(a,n,k));
    }
}
