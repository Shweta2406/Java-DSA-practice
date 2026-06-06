// Converted from C++ to Java
import java.util.*;

public class StockSpanUsingVectors {

    //{ Driver Code Starts


    // } Driver Code Ends

    class Solution
    {
        public:
        //Function to calculate the span of stockâ€™s price for all n days.
        List<Integer> calculateSpan(int[] arr, int n)
        {
           // Your code here
           Stack<Integer> s;
           List<Integer> span = new ArrayList<>();
           s.push(0);
           span.add(1);

           for(int i=1;i<n;i++)
           {
               while(!s.isEmpty() && arr[s.peek()]<=arr[i])
               {
                   s.pop();
               }

               s.isEmpty()?span.add(i+1):span.add(i-s.peek());
               s.push(i);
           }
           return span;

        }
    };



    //{ Driver Code Starts.

    public static void main(String[] args)
    {
    	int t;
    	t = scanner.nextInt();
    	while(t--)
    	{
    		int n;
    		n = scanner.nextInt();
    		int i,a[n];
    		for(i=0;i<n;i++)
    		{
    			a = scanner.nextInt()[i];
    		}
    		Solution obj;
    		List<Integer> s = obj.calculateSpan(a, n);

    		for(i=0;i<n;i++)
    		{
    			System.out.print(String.valueOf(s[i]) + " ");
    		}
    		System.out.println();
    	}
    	// (return 0 removed - Java main is void)
    }

    // } Driver Code Ends
}
