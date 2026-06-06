// Converted from C++ to Java
import java.util.*;

public class ClosestNo {

    //{ Driver Code Starts

    //Given  two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.
    // } Driver Code Ends
    class Solution {
      public:
        public static int closestNumber(int N , int M) {
            // code here
             int rem=N%M;
            if(rem==0) return N;

            int i=N,j=N;// two variable for forward and backward 
            while(true){
                if(i%M==0)
                    return i;
                     i--;//else go backward -ve side
                if(j%M==0)
                    return j;
                     j++;    //else go forward +ve side
        }
    };

    //{ Driver Code Starts.
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while (t--) {
            int N,M;

            N = scanner.nextInt()>>M;

            Solution ob;
            System.out.println(ob.closestNumber(N,M));
        }
        // (return 0 removed - Java main is void)
    }
    };
}
