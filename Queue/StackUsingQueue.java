// Converted from C++ to Java
import java.util.*;

public class StackUsingQueue {

    /* Program to implement a stack using 
    two queue */

    class stack
    {
        Queue<Integer> q1,q2;
        int size;
        stack()
        {
            size=0;
        }

       public static void push(int x)
       {
           size++;
           q2.push(x);
           while(!q1.isEmpty())
           {
               q2.push(q1.peek());
               q1.pop();
           }
           //for swapping names of q1 and q2
           Queue<Integer>q=q1;
           q1=q2;
           q2=q;
       }

       public static void pop()
       {
           if(q1.isEmpty())
           return;
           q1.pop();
           size--;
       }

       public static int top()
       {
           if(q1.isEmpty())
           return -1;
           return q1.peek();
       }

       public static int Stacksize()
       {
           return size;
       }


    };

    public static void main(String[] args)
    {
        stack s;
        s.push(11);
        s.push(12);
        s.push(13);
        System.out.println(s.Stacksize());
        System.out.println(s.peek());
        s.pop();
        System.out.print(s.peek());
        // (return 0 removed - Java main is void)

    }
}

