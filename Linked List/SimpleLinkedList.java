// Converted from C++ to Java
import java.util.*;

public class SimpleLinkedList {


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
        node head=new node(10);
        node second=new node(20);
        node third=new node(30);
        head.next=second;
        second.next=third;
        third.next=null;

        System.out.print(String.valueOf(head.data) + "--" + String.valueOf(second.data) + "--" + String.valueOf(third.data));


    }

}

