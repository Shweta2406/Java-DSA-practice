// Converted from C++ to Java
import java.util.*;

public class CoolString {




    public static int minRemovalsToMakeCool(const String& s) {
        int n = s.length();
        int minRemovals = 0;

        for (int i = 1; i < n-1; i += 2) {
            if (s[i] != s[i - 1]) {
                minRemovals++;
            }
        }

        return minRemovals;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Enter the lowercase String: ");
        s = scanner.nextInt();

        int result = minRemovalsToMakeCool(s);
        System.out.println("Minimum number of characters to remove: " + String.valueOf(result));

        // (return 0 removed - Java main is void)
    }

}
