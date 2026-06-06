// Converted from C++ to Java
import java.util.*;

public class EvaluationOfPostfix {


    // Function to evaluate a postfix expression
    public static void evaluation_of_postfix(String str) {
        Stack<double> s; // Stack to hold operands and perform calculations

        // Loop through each character in the postfix expression
        for (char c : str) {
            if (isdigit(c)) {
                // If the character is a digit, convert it to a double and push onto the stack
                s.push(static_cast<double>(c - '0'));
            } else if (c != ' ') {
                // If the character is not a space, it's an operator or space separator

                // Pop two operands from the stack
                double operand2 = s.peek();
                s.pop();
                double operand1 = s.peek();
                s.pop();

                // Perform the operation based on the operator
                switch (c) {
                    case '+':
                        s.push(operand1 + operand2);
                        break;
                    case '-':
                        s.push(operand1 - operand2);
                        break;
                    case '*':
                        s.push(operand1 operand2);
                        break;
                    case '/':
                        s.push(operand1 / operand2);
                        break;
                    case '^':
                        s.push((int)Math.pow(operand1, operand2));
                        break;
                }
            }
        }

        System.out.print(s.peek(); // The final result will be at the top of the stack } public static void main(String[] args) { String str = "123+*8-");

        // Call the function to evaluate the postfix expression
        evaluation_of_postfix(str);
        // (return 0 removed - Java main is void)
    }








    // // // // 
    // void evaluate_postfix(String str)
    // {
    //     Stack<Integer> s;
    //     for(int i=0;i<str.length();i++)
    //     {
    //         char c=str[i];
    //         if(isdigit(c))
    //         {
    //             s.push(static_cast<Integer>(c-'0'));
    //         }
    //         else if (c != ' ')
    //         {
    //             int op2=s.peek();
    //             s.pop();
    //             int op1=s.peek();
    //             s.pop();

    //             switch(c)
    //             {
    //                 case '+':
    //                 s.push(op1+op2);
    //                 break;

    //                 case '-':
    //                 s.push(op1-op2);
    //                 break;

    //                 case '*':
    //                 s.push(op1 op2);
    //                 break;

    //                 case '/':
    //                 s.push(op1/op2);
    //                 break;

    //                 case '^':
    //                 s.push(op1^op2);
    //                 break;
    //             }
    //         }
    //     }
    //     cout<<s.peek();
    // }

    // public static void main(String[] args)
    // {
    //     String str="123+*8-";
    //     evaluate_postfix(str);
    //     return 0;
    // }





}

