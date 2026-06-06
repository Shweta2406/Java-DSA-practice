// Converted from C++ to Java
import java.util.*;

public class InfixPrefixSimple {


    // Function to return precedence of operators
    public static int prec(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '^')
            return 3;
        else
            return -1;
    }

    // Function to convert infix expression to prefix expression
    public static void infix_to_prefix(String exp) {
        Stack<Character> st;
        String res;
        Collections.reverse(exp);
        for (int i = 0; i < exp.length(); i++) {
            char c = exp[i];
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                res += c;
            } else if (c == ')') {
                st.push(c);
            } else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    res += st.peek();
                    st.pop();
                }
                if (!st.isEmpty())
                    st.pop(); // Pop the ')' from the stack
            } else {
                while (!st.isEmpty() && prec(c) < prec(st.peek())) {
                    res += st.peek();
                    st.pop();
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            res += st.peek();
            st.pop();
        }
        Collections.reverse(res);

        System.out.print(res);
    }

    public static void main(String[] args) {
        String exp = "(x+y z/w)+u";

        // Call the function to convert infix to prefix
        infix_to_prefix(exp);
        // (return 0 removed - Java main is void)
    }

}

