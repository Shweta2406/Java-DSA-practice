// Converted from C++ to Java
import java.util.*;

public class RecursiveTraversal {


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

    public static void print(node head)
    {
        if(head==null)
        return;
        System.out.print(String.valueOf(head.data) + " ");
        print(head.next);
    }
    public static void main(String[] args)
    {
        node head=new node(10);
        node second=new node(20);
        node third=new node(30);
        head.next=second;
        second.next=third;
        third.next=null;

        //cout<<head.data<<"--"<<second.data<<"--"<<third.data;
        print(head);

    }

}

