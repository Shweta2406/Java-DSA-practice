// Converted from C++ to Java
import java.util.*;

public class InfixToPostfix {


    // Function to return precedence of operators
    public static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // Function to convert infix expression to postfix expression
    public static void infix_postfix(String exp) {
        Stack<Character> s;   // Stack to hold operators and parentheses
        String res;      // String to store the final postfix expression

        // Loop through each character in the input expression
        for (int i = 0; i < exp.length(); i++) {
            char c = exp[i];

            // If the character is an operand (letter or digit), add it to the result
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                res += c;
            }
            // If the character is an opening parenthesis, push it onto the stack
            else if (c == '(') {
                s.push('(');
            }
            // If the character is a closing parenthesis, pop operators from the stack
            // and add them to the result until an opening parenthesis is encountered
            else if (c == ')') {
                while (s.peek() != '(') {
                    res += s.peek();
                    s.pop();
                }
                s.pop();  // Remove the opening parenthesis from the stack
            }
            // If the character is an operator, pop operators from the stack and add them
            // to the result while they have higher or equal precedence compared to the current operator
            else {
                while (!s.isEmpty() && prec(c) <= prec(s.peek())) {
                    res += s.peek();
                    s.pop();
                }
                s.push(c);  // Push the current operator onto the stack
            }
        }

        // Pop any remaining operators from the stack and add them to the result
        while (!s.isEmpty()) {
            res += s.peek();
            s.pop();
        }

        System.out.print(res;  // Print the final postfix expression } public static void main(String[] args) { String exp = "a+b(c^d-e)^(f+g h)-i");

        // Call the function to convert infix to postfix
        infix_postfix(exp);
        // (return 0 removed - Java main is void)
    }

}

