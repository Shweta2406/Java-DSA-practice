// Converted from C++ to Java
import java.util.*;

public class ReverseWordsInString {




    public static void reverse(char[] str,int low, int high){
        while(low<=high){
            { int _t = str[low]; str[low] = str[high]; str[high] = _t; };
            low++;
            high--;
        }
    }

    public static void reverseWords(char[] str,int n){
        int start=0;
        for(int end=0;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }

    public static void main(String[] args) 
    { 
        String s = "Welcome to Gfg";
        int n=s.length();
        char str[n];
        strcpy(str, s.c_str());
        System.out.println("After reversing words in the String:");
        reverseWords(str,n);
        for (int i = 0; i < n; i++) 
            System.out.print(str[i]);

        // (return 0 removed - Java main is void) 
    } 
}
