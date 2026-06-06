// Converted from C++ to Java
import java.util.*;

public class InsertAtEnd {

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

    node insert_at_end(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        return temp;
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;

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
        head=insert_at_end(head,1);
        head=insert_at_end(head,11);
        head=insert_at_end(head,111);
        head=insert_at_end(head,1111);
        print(head);
        // (return 0 removed - Java main is void)
    }
}

