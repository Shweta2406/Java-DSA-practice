// Converted from C++ to Java
import java.util.*;

public class LongestConsecutive1 {

    //User function Template for C++

    /*  Function to calculate the longest consecutive ones N: given input to calculate the longest consecutive ones
    */

        public static int maxConsecutiveOnes(int N)
        {
            // code here
            int mx=0,c=0;
            while(N){
                if((N&1)==0){
                    c=0;
                }
                else{
                    c++;
                    mx=Math.max(mx,c);
                }
                N=N>>1;
            }
            return mx;
        }

    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();
        int ans=maxConsecutiveOnes(n);
        System.out.print(ans);
    }
}

