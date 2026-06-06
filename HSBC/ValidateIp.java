// Converted from C++ to Java
import java.util.*;

public class ValidateIp {

    //{ Driver Code Starts


    // } Driver Code Ends
    /* The function returns 1 if
    IP String is valid else return 0
    You are required to complete this method */
    class Solution {
          public:
            public static int isValid(String s) {
        String temp = "";
        List<String> v = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            if (s[i] != '.') {
                temp += s[i];
            } else {
                v.add(temp);
                temp = "";
            }
        }

        v.add(temp); 

        if (v.size() != 4) {
            // (return 0 removed - Java main is void) 
        }

        for (int i = 0; i < v.size(); i++) {
            // to check for leading zeroes
            if(v[i].isEmpty() || v[i].size() > 1 && v[i][0] == '0'){
                // (return 0 removed - Java main is void)
            }
            // to check for non interger charchater
            for(char c: v[i]){
                if(!isdigit(c)){
                    // (return 0 removed - Java main is void)
                }
            }
            int num = Integer.parseInt(v[i]);
            if (num < 0 || num > 255) {
                // (return 0 removed - Java main is void) 
            }
        }

        return 1; 
    }


    };

    //{ Driver Code Starts.

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        // your code goes here
        int t;
        t = scanner.nextInt();
        while (t--) {
            String s;
            s = scanner.nextInt();
            Solution ob;
            System.out.println(ob.isValid(s));
        }
        // (return 0 removed - Java main is void)
    }
    // } Driver Code Ends
}
