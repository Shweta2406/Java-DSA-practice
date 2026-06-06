// Converted from C++ to Java
import java.util.*;

public class Leftmostrepeatingcharacter {

    static final int CHAR = 256;   // replaced C++ const with static final

    public static int leftMost(String str) {
        boolean[] visited = new boolean[CHAR];   // replaced C++ bool visited[CHAR] + fill()
        Arrays.fill(visited, false);
        int res = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)])           // charAt() replaces str[i]
                res = i;
            else
                visited[str.charAt(i)] = true;
        }
        return res;
    }

    // Naive solution (commented out):
    // public static int leftMostNaive(String str) {
    //     for (int i = 0; i < str.length(); i++)
    //         for (int j = i + 1; j < str.length(); j++)
    //             if (str.charAt(i) == str.charAt(j)) return i;
    //     return -1;
    // }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}
