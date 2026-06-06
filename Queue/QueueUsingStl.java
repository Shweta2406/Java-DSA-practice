// Converted from C++ to Java
import java.util.*;

public class QueueUsingStl {

    public static void main(String[] args)
    {
        Deque<Integer> q = new LinkedList<>();
        q.addLast(10);
        q.addLast(20);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        q.addLast(30);
        q.poll();
        System.out.println(q.peek());
        System.out.println(q.peekLast());
        q.addLast(10);
        while(!q.isEmpty())
        {
            System.out.print(String.valueOf(q.peek()) + " ");
            q.poll();
        }
    }
}
