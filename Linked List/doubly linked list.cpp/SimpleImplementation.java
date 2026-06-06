// Converted from C++ to Java
import java.util.*;

public class SimpleImplementation {

    class node{
        int data;
        node prev;
        node next;
        node(int x)
        {
            data=x;
            prev=null;
            next=null;
        }
    };
    public static void main(String[] args)
    {
        node head=new node(10);
        node second=new node(20);
        node tail=new node(30);
        head.prev=null;
        head.next=second;
        second.prev=head;
        second.next=tail;
        tail.prev=second;
        tail.next=null;
        System.out.print(String.valueOf(head.data) + "--" + String.valueOf(second.data) + "--" + String.valueOf(tail.data));
    }
}

