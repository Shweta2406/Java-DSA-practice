// Converted from C++ to Java
import java.util.*;

public class GetminInO1Space {


    class MyStack {

        Stack<Integer> s;
        int min;

    public static void push(int x) {

          if(s.isEmpty() ) {
             min=x;
             s.push(x);
          }
          else if(x<=min){
              s.push(2*x-min);
              min=x;
          }else{
          s.push(x);
          }
       }

    public static int pop() {

        int t=s.peek();s.pop();
        if(t<=min){
            int res=min;
            min=2*min-t;
            return res;
        }else{
            return t;
        }
       }

    public static int top() {
        int t=s.peek();
        return ((t<=min)? min : t);
       }

    public static int getMin() {
          return min;
       }
    };

    public static void main(String[] args)
    {
        MyStack s;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + String.valueOf(s.getMin()));

        // (return 0 removed - Java main is void) 
    }

}

