// Converted from C++ to Java
import java.util.*;

public class BalancedParanthesis {



    public static boolean isBalanced(String s) {
        Stack<Character> st;
        for (char c : s) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (c == ')' && st.peek() != '(') {
                    return false;
                } else if (c == ']' && st.peek() != '[') {
                    return false;
                } else if (c == '}' && st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Enter a String with parentheses: ");
        s = scanner.nextInt();
        if (isBalanced(s)) {
            System.out.println("The parentheses in the String are balanced.");
        } else {
            System.out.println("The parentheses in the String are not balanced.");
        }
        // (return 0 removed - Java main is void)
    }

}
