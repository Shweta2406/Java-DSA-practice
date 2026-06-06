// Converted from C++ to Java
import java.util.*;

public class Largesmallsum {

    // You are required to implement the following Function 

    // def LargeSmallSum(arr)

    // The function accepts an integers arr of size ’length’ as its arguments you are required 
    //to return the sum of second largest  element from the even positions and second smallest 
    //from the odd position of given ‘arr’

    // Assumption:

    // All array elements are unique
    // Treat the 0th position as even
    // NOTE

    // Return 0 if array is empty
    // Return 0, if array length is 3 or less than 3
    // Example

    // Input

    // arr:3 2 1 7 5 4

    // Output

    // 7

    // Explanation

    // Second largest among even position elements(1 3 5) is 3
    // Second smallest among odd position element is 4
    // Thus output is 3+4 = 7
    // Sample Input

    // arr:1 8 0 2 3 5 6

    // Sample Output

    // 8




    public static int LargeSmallSum (List<Integer> arr)
    {
      int l=arr.size();
      if(l<=3)
      // (return 0 removed - Java main is void)

      List<Integer> even = new ArrayList<>();
      List<Integer> odd = new ArrayList<>();

      for(int i=0;i<l;i++)
      {
          if(i%2==0)
          even.add(arr[i]);
          else
          odd.add(arr[i]);
      }
      int el=even.size();
      int ol=odd.size();
      Collections.sort(even);
      Collections.sort(odd);

      return (even[el-2]+odd[1]);
    }

    public static void main(String[] args)
    {
      List<Integer>arr = { 1 ,8 ,0 ,2 ,3, 5, 6 };

      int result = LargeSmallSum (arr);
      System.out.println(result);

      // (return 0 removed - Java main is void)
    }
}

