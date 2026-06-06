// Converted from C++ to Java
import java.util.*;

public class LargestRectangularAreaInhistogram {


    public static int getMaxArea(int[] arr,int n){
        Stack<Integer> s;
        int res=0;
        int tp;
        int curr;

        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                tp=s.peek();s.pop();
                curr=arr[tp]* (s.isEmpty() ? i : i - s.peek() - 1);
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while(s.isEmpty()==false){
            tp=s.peek();s.pop();
            curr=arr[tp]* (s.isEmpty() ? n : n - s.peek() - 1);
            res=Math.max(res,curr);
        }

        return res;

    }

    public static void main(String[] args) 
    { 
        int[] arr={6,2,5,4,1,5,6};
        int n=7;
        System.out.print("Maximum Area: " + String.valueOf(getMaxArea(arr,n)));
        // (return 0 removed - Java main is void) 
    }

}
