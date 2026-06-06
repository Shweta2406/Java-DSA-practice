// Converted from C++ to Java
import java.util.*;

public class LeftmostNonrepeating {

    public static int nonRep(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {   // charAt() replaces str[i]
                    flag = true;
                    break;
                }
            }
            if (!flag) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}
