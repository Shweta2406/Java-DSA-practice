// Converted from C++ to Java
import java.util.*;

public class TraversingLinkedList {


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
        node temp=head;
        while(temp!=null)
        {
          System.out.print(String.valueOf(temp.data) + " ");
          temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        node head=new node(10);
        node second=new node(20);
        node third=new node(30);
        head.next=second;
        second.next=third;
        third.next=null;

       // cout<<head.data<<"--"<<second.data<<"--"<<third.data;
        print(head);

    }

}

