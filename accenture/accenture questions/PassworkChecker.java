// Converted from C++ to Java
import java.util.*;

public class PassworkChecker {

    // Returns 1 if valid password, else 0.
    // Rules: >= 4 chars, >= 1 digit, >= 1 uppercase, no space or '/', must not start with digit.

    public static int CheckPassword(String str, int n) {
        int num = 0, cap = 0;

        if (n < 4)
            return 0;

        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')   // charAt() replaces str[0]
            return 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if (c == ' ' || c == '/')
                return 0;

            if (c >= 'A' && c <= 'Z')
                cap++;

            if (c >= '0' && c <= '9')
                num++;
        }
        return (cap > 0 && num > 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(CheckPassword(s, s.length()));
    }
}
