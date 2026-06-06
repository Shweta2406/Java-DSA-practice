// Converted from C++ to Java
import java.util.*;

public class NearestSmallest {


    public static void nearestSmallest(int[] arr, int n)
    {
        Stack<Integer> s;
        List<Integer> v = new ArrayList<>();
        s.push(arr[n - 1]);
        v.add(-1);

        for(int i = n - 2; i >= 0; i--)
        {
            while(!s.isEmpty() && s.peek() >= arr[i])
            {
                s.pop();
            }

            int ns=s.isEmpty()?-1:s.peek();
            v.add(ns);
            s.push(arr[i]);
        }


        for(int i = v.size()-1; i >=0; i--)
        {
            System.out.print(String.valueOf(v[i]) + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {3,2,11,7,6,5,6,1};
        int n = 8;
        nearestSmallest(arr, n);
        // (return 0 removed - Java main is void)
    }

}
