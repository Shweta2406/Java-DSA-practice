// Converted from C++ to Java
import java.util.*;

public class NextGreater {

    //***naive solution****
    // // 
    // void nextGreater(int[] arr,int n){

    //     for(int i=0;i<n;i++){
    //         int j;
    //         for(j=i+1;j<n;j++){
    //             if(arr[j]>arr[i]){
    //                 cout<<arr[j]<<" ";
    //                 break;
    //             }
    //         }
    //         if(j==n)
    //             cout<<-1<<" ";
    //     }
    // }

    // public static void main(String[] args) 
    // { 
    //     int[] arr={5,15,10,8,6,12,9,18};
    //     int n=8;
    //     nextGreater(arr,n);
    //     return 0; 
    // }



    List<Integer> nextGreater(int[] arr,int n){
        Stack<Integer> s;
        List<Integer> v = new ArrayList<>();
        s.push(arr[n-1]);
        v.add(-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            int ng=s.isEmpty()?-1:s.peek();
            v.add(ng);
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;

    }

    public static void main(String[] args) 
    { 
        int[] arr={5,15,10,8,6,12,9,18};
        int n=8;
        for(int x: nextGreater(arr,n)){
            System.out.print(String.valueOf(x) + " ");
        }
        // (return 0 removed - Java main is void) 
    }

}

