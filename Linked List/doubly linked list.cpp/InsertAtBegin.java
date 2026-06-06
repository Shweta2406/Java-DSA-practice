// Converted from C++ to Java
import java.util.*;

public class InsertAtBegin {

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

    node insert_at_begin(node head,int x)
    {
        node temp=new node(x);

        temp.prev=null;
        temp.next=head;
        if(head!=null)
        head.prev=temp;
        return temp;


    }

    public static void print(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
        node head=null;
        head=insert_at_begin(head,1);
        head=insert_at_begin(head,11);
        head=insert_at_begin(head,111);
        head=insert_at_begin(head,1111);
        print(head);
        // (return 0 removed - Java main is void)
    }
}

