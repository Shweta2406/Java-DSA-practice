// Converted from C++ to Java
import java.util.*;

public class PreviousGreaterElement {


    //*********naive*****
    // void printPrevGreater(int[] arr,int n){

    //     for(int i=0;i<n;i++){
    //         int j;
    //         for(j=i-1;j>=0;j--){
    //             if(arr[j]>arr[i]){
    //                 cout<<arr[j]<<" ";
    //                 break;
    //             }
    //         }
    //         if(j==-1)
    //             cout<<-1<<" ";
    //     }
    // }

    public static void printPrevGreater(int[] arr,int n)
    {
        Stack<Integer> s;
        s.push(arr[0]);
        System.out.print(String.valueOf(-1) + " ");
        for(int i=1;i<n;i++)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(String.valueOf(pg) + " ");
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) 
    { 
        int[] arr={20,30,10,5,15};
        int n=5;
        printPrevGreater(arr,n);
        // (return 0 removed - Java main is void) 
    }

}

