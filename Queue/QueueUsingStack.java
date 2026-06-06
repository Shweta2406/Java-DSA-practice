// Converted from C++ to Java
import java.util.*;

public class QueueUsingStack {

    // CPP program to implement Queue using
    // two stacks with costly enQueue()

    class queue
    {
        Stack<Integer>s1,s2;
        public static void enqueue(int x)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(x);
            while(!s2.isEmpty())
            {
                s1.push(s2.peek());
                s2.pop();
            }

        }

        public static int dequeue()
        {
            if(s1.isEmpty())
            return -1;
            else
            {
                int x=s1.peek();
                s1.pop();
                return x;
            }
        }
    };
    public static void main(String[] args)
    {
     queue s;
      s.enqueue(1);
     s.enqueue(2);
      s.enqueue(3);
     s.enqueue(4);
     System.out.println(s.dequeue());
     System.out.println(s.dequeue());
    // (return 0 removed - Java main is void)
    }
}

