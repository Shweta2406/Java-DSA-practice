// Converted from C++ to Java
import java.util.*;

public class Delete {


    public static int removeElement(int[] a, int n, int x)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                break;
            }
        }

        if(i == n)
        {
            return n;
        }

        for(int j = i; j < n - 1; j++)
        {
            a[j] = a[j + 1];
        }

        return n - 1;
    }

    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter n: ");
        n = scanner.nextInt();

        int a[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++)
        {
            a = scanner.nextInt()[i];
        }

        int element;
        System.out.println("Enter element to be deleted: ");
        element = scanner.nextInt();

        n = removeElement(a, n, element);

        System.out.println("New array after deletion is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(String.valueOf(a[i]) + " ");
        }

        // (return 0 removed - Java main is void)
    }

}
