// Converted from C++ to Java
import java.util.*;

public class DequeUsingStl {

    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1, 2, 3));
        dq.addFirst(0);
        dq.addLast(4);

        for(Integer x : dq)
        {
            System.out.print(String.valueOf(x) + " ");
        }
        System.out.println();

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq.size());
        for(Integer x : dq)
        {
            System.out.print(String.valueOf(x) + " ");
        }
        System.out.println();
    }
}

