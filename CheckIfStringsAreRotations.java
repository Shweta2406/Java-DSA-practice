// Converted from C++ to Java
import java.util.*;

public class CheckIfStringsAreRotations {


    public static boolean arerotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.indexOf(s2) != String::-1;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(arerotations(s1, s2));
        // (return 0 removed - Java main is void)
    }

}
