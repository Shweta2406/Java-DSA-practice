// Converted from C++ to Java
import java.util.*;

public class SimpleCircularSinglylinkedlist {

    class node
    {
       int data;
       node next;
       node(int x)
       {
           data=x;
           next=null;
       }
    };

    public static void main(String[] args)
    {
     node head=new node(1);
     node second=new node(2);
     node third=new node(3);
     head.next=second;
     second.next=third;
     third.next=head;
     System.out.print(String.valueOf(head.data) + " " + String.valueOf(second.data) + " " + String.valueOf(third.data));
     // (return 0 removed - Java main is void)

    }
}

