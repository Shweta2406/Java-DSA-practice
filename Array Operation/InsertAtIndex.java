// Converted from C++ to Java
import java.util.*;

public class InsertAtIndex {

    public static void insert(int[] a,int n,int pos,int x)
    {
        if(n>=pos)
        {
        int index=pos-1;
        for(int i=n;i>=index;i--)
        {
            a[i+1]=a[i];
        }
        a[index]=x;

        System.out.println("new array is:");
        for(int i=0;i<n;i++)
    {
        System.out.print(String.valueOf(a[i]) + " ");
    }
        }
        else{
            System.out.print("out of capacity");
        }
    }

    public static void main(String[] args)
    {
    int n;
    System.out.println("enter n: ");

    n = scanner.nextInt();
    int x;
    int a[n];
    System.out.println("enter elements: ");
    for(int i=0;i<n;i++)
    {
        a = scanner.nextInt()[i];
    }
    int pos;
    System.out.println("enter position: ");
    pos = scanner.nextInt();
    int element;
    System.out.println("enter element: ");
    x = scanner.nextInt();
     insert(a,n,pos,x);
    }
}
