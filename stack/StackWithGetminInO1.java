// Converted from C++ to Java
import java.util.*;

public class StackWithGetminInO1 {


    class Mystack{
        Stack<Integer> ms;
        Stack<Integer> as;

        public static void push(int x)
        {
            if(ms.isEmpty())
            {
                ms.push(x);
                as.push(x);
                return;
            }
            ms.push(x);
            if(as.peek()>=ms.peek())
            {
                as.push(x);
            }
        }

        public static void pop()
        {
            ms.pop();
            if(as.peek()==ms.peek())
            {
                as.pop();
            }
        }

        public static int top()
        {
            return ms.peek();
        }

        public static int getmin()
        {
            return as.peek();
        }

    };

    public static void main(String[] args)
    {
        Mystack s;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + String.valueOf(s.getmin()));

        // (return 0 removed - Java main is void) 
    }

}

