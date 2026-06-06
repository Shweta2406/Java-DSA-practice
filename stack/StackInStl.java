// Converted from C++ to Java
import java.util.*;

public class StackInStl {


    public static void main(String[] args)
    {
    Stack<Integer> s;
    s.push(10);
    s.push(20);
    s.pop();
    s.push(25);
    s.push(30);
    System.out.println(s.isEmpty());
    System.out.println(s.size());
    System.out.println(s.peek());
    while(s.isEmpty()==false)
    {
        System.out.print(String.valueOf(s.peek()) + " ");
        s.pop();
    }
    // (return 0 removed - Java main is void)
    }
}
