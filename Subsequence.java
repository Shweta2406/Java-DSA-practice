// Converted from C++ to Java
import java.util.*;

public class Subsequence {

    //Check if a String is Subsequence of Other 

    public static boolean isSubSeq(String s1, String s2, int n, int m){
        int j = 0;

        for(int i = 0; i < n && j < m; i++){
            if(s1[i] == s2[j])
            j++;
        }

        return j == m;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    	int n,m;
    	String s1, s2;
    	n = scanner.nextInt()>>m;
    	s1 = scanner.nextInt()>>s2;

    	System.out.print(String.valueOf(boolalpha) + String.valueOf(isSubSeq(s1, s2, n, m)));

    	// (return 0 removed - Java main is void)
    }
}
