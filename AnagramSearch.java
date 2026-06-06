// Converted from C++ to Java
import java.util.*;

public class AnagramSearch {

    static final int CHAR = 256;   // replaced C++ const with static final

    public static boolean areAnagram(String pat, String txt, int i) {
        int[] count = new int[CHAR];   // replaced C++ int count[CHAR]={0} with int[]
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;    // charAt() replaces [] indexing on String
            count[txt.charAt(i + j)]--;
        }
        for (int j = 0; j < CHAR; j++) {
            if (count[j] != 0) return false;
        }
        return true;
    }

    public static boolean isPresent(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            if (areAnagram(pat, txt, i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        if (isPresent(txt, pat))
            System.out.print("Anagram search found");
        else
            System.out.print("Anagram search not found");
    }
}
