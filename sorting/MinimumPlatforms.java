// Converted from C++ to Java
import java.util.*;

public class MinimumPlatforms {

    //{ Driver Code Starts
    // Program to find minimum number of platforms
    // required on a railway station


    // } Driver Code Ends
    class Solution{
        public:
        //Function to find the minimum number of platforms required at the
        //railway station such that no train waits.
        public static int findPlatform(int[] arr, int[] dep, int n)
        {
        	// Your code here
        	Arrays.sort(arr, 0, n);
            Arrays.sort(dep, 0, n);
            int cnt=0;
            int maxans=0;
            int i=0;//for arrival time
            int j=0;//for departure time
            while(i<n){
                if(arr[i]<=dep[j]){
                    cnt++;
                    maxans=Math.max(maxans,cnt);
                    i++;
                }else if(arr[i]>dep[j]){
                    cnt--;
                    j++;

                }
            }


            return maxans;

        }
    };


    //{ Driver Code Starts.
    // Driver code
    public static void main(String[] args)
    {
        int t;
        t = scanner.nextInt();
        while(t--) 
        {
            int n;
            n = scanner.nextInt();
            int arr[n];
            int dep[n];
            for(int i=0;i<n;i++)
                arr = scanner.nextInt()[i];
            for(int j=0;j<n;j++){
                dep = scanner.nextInt()[j];
            }
            Solution ob;
            System.out.println(ob.findPlatform(arr, dep, n));
        } 
       // (return 0 removed - Java main is void)
    }
    // } Driver Code Ends
}
