// Converted from C++ to Java
import java.util.*;

public class AnagramString {

    // Given two strings, check if they are anagrams of each other.

    static final int CHAR = 256;   // replaced C++ const with static final

    public static boolean areAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2)
            return false;

        int[] count = new int[CHAR];   // replaced C++ int count[CHAR]={0}
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;     // charAt() replaces [] indexing
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abaac";
        String str2 = "aacba";
        if (areAnagram(str1, str2))
            System.out.print("The two strings are anagram of each other");
        else
            System.out.print("The two strings are not anagram of each other");
    }

    // Naive solution (commented out):
    // public static boolean areAnagramNaive(String s1, String s2) {
    //     if (s1.length() != s2.length()) return false;
    //     char[] a = s1.toCharArray(); Arrays.sort(a);
    //     char[] b = s2.toCharArray(); Arrays.sort(b);
    //     return Arrays.equals(a, b);
    // }
}
