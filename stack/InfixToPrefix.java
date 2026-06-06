// Converted from C++ to Java
import java.util.*;

public class InfixToPrefix {

    // CPP program to convert infix to prefix

    public static boolean isOperator(char c)
    {
        return (!isalpha(c) && !isdigit(c));
    }

    public static int getPriority(char C)
    {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;
        // (return 0 removed - Java main is void)
    }

    public static String infixToPostfix(String infix)
    {
        infix = '(' + infix + ')';
        int l = infix.size();
        Stack<Character> char_stack;
        String output;

        for (int i = 0; i < l; i++) {

            // If the scanned character is an
            // operand, add it to output.
            if (isalpha(infix[i]) || isdigit(infix[i]))
                output += infix[i];

            // If the scanned character is an
            // ‘(‘, push it to the stack.
            else if (infix[i] == '(')
                char_stack.push('(');

            // If the scanned character is an
            // ‘)’, pop and output from the stack
            // until an ‘(‘ is encountered.
            else if (infix[i] == ')') {
                while (char_stack.peek() != '(') {
                    output += char_stack.peek();
                    char_stack.pop();
                }

                // Remove '(' from the stack
                char_stack.pop();
            }

            // Operator found
            else 
            {
                if (isOperator(char_stack.peek())) 
                {
                    if(infix[i] == '^')
                    {
                          while (getPriority(infix[i]) <= getPriority(char_stack.peek()))
                           {
                             output += char_stack.peek();
                             char_stack.pop();
                           }

                    }
                    else
                    {
                        while (getPriority(infix[i]) < getPriority(char_stack.peek()))
                           {
                             output += char_stack.peek();
                             char_stack.pop();
                           }

                    }

                    // Push current Operator on stack
                    char_stack.push(infix[i]);
                }
            }
        }
          while(!char_stack.isEmpty()){
              output += char_stack.peek();
            char_stack.pop();
        }
        return output;
    }

    public static String infixToPrefix(String infix)
    {
        /* Reverse String Replace ( with ) and vice versa Get Postfix Reverse Postfix  *  */
        int l = infix.size();

        // Reverse infix
        Collections.reverse(infix);

        // Replace ( with ) and vice versa
        for (int i = 0; i < l; i++) {

            if (infix[i] == '(') {
                infix[i] = ')';
            }
            else if (infix[i] == ')') {
                infix[i] = '(';
            }
        }

        String prefix = infixToPostfix(infix);

        // Reverse postfix
        Collections.reverse(prefix);

        return prefix;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = ("x+y z/w+u");
        System.out.print(String.valueOf(infixToPrefix(s)) + String.valueOf(std::endl));
        // (return 0 removed - Java main is void)
    }
}

