// Converted from C++ to Java
import java.util.*;

public class Binary {

    // Problem: Calculate result of a binary string with operations:
    // A = AND, B = OR, C = XOR
    // Example: "1C0C1C1A0B1" -> 1

    public static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty())
            return -1;

        int i = 0;
        int a = str.charAt(i++) - '0';   // replaced *str pointer with index i

        while (i < str.length()) {
            char op = str.charAt(i++);   // replaced *str pointer dereference
            int digit = str.charAt(i++) - '0';

            if (op == 'A')
                a &= digit;
            else if (op == 'B')
                a |= digit;
            else if (op == 'C')
                a ^= digit;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(OperationsBinaryString(s));
    }
}
