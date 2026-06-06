// Converted from C++ to Java
import java.util.*;

public class Traversal {

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
        if(head==null)
        return;
        do
        {
            System.out.print(String.valueOf(temp.data) + " ");
            temp=temp.next;
        }while(temp!=head);

    }

    public static void main(String[] args)
    {
     node head=new node(1);
     node second=new node(2);
     node third=new node(3);
     head.next=second;
     second.next=third;
     third.next=head;
     //cout<<head.data<<" "<<second.data<<" "<<third.data;
     print(head);
     // (return 0 removed - Java main is void)

    }
}

