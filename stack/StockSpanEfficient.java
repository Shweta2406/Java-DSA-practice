// Converted from C++ to Java
import java.util.*;

public class StockSpanEfficient {

    //Stock Span problem. We have a series of N daily price quotes for a stock
    // and we need to calculate the span of the stock's price for all N days. 
    //The span Si of the stock's price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than its price on the given day. 
    public static int stock_span(int[] arr,int n)
    {
        Stack<Integer> s;
        s.push(0);
        System.out.print(String.valueOf(1) + " ");
        for(int i=1;i<n;i++)
        {
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(String.valueOf(span) + " ");
            s.push(i);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={18,12,13,14,11,16};
        int n=6;
        stock_span(arr,n);
        // (return 0 removed - Java main is void)
    }
}
