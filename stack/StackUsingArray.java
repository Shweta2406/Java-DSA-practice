// Converted from C++ to Java
import java.util.*;

public class StackUsingArray {


    class stack
    {
        int arr;
        int top;
        int cap;
        stack(int c)
        {
            cap=c;
            arr=new int[cap];
            top=-1;
        }

        public static void push(int x)
        {
            if(top==cap-1)
            {
                System.out.println("overflow");
            }
            else
            {
            top++;
            arr[top]=x;
            }
        }

        public static int pop()
        {
            if(top==-1)
            {
                System.out.println("underflow");
                return Integer.MIN_VALUE;
            }
            else
            {
                int res=arr[top];
                top--;
                return res;
            }
        }

        public static int peek()
        {
            if(top==-1)
            {
                System.out.println("Stack is Empty");
            }
            return arr[top];
        }

        public static int size()
        {
            return top+1;
        }

        public static boolean isempty()
        {
            if(top==-1)
            {
                return true;
            }
            else
            return false;
        }

        public static void display()
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(String.valueOf(arr[i]) + " ");
            }
        }
    };

    public static void main(String[] args)
    {
        stack s(5);
        s.push(10);
        s.push(11);
        s.push(12);
        System.out.println(s.peek());
        System.out.println("size: " + String.valueOf(s.size()));
        System.out.println(String.valueOf(s.pop()) + " is poped");
        System.out.println(s.isempty());
        System.out.print("elements in stack: ");
        s.display();
        // (return 0 removed - Java main is void)
    }
}

