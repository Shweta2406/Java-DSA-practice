// Converted from C++ to Java
import java.util.*;

public class NaivePatternSearching {

    // String parameters passed by value in Java (no & needed)
    public static void patSearching(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= (n - m); i++) {
            int j;
            for (j = 0; j < m; j++)
                if (pat.charAt(j) != txt.charAt(i + j))   // charAt() replaces [] indexing
                    break;

            if (j == m)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String txt = "ABCABCD";
        String pat = "ABCD";
        System.out.print("All index numbers where pattern found: ");
        patSearching(txt, pat);
    }
}
