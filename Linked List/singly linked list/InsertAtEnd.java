// Converted from C++ to Java
import java.util.*;

public class InsertAtEnd {


    class node{
        int data;
        node next;
        node(int x)
        {
            data=x;
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
      return head;
    }

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
        node head=null;
        head=insert_at_end(head,10);
        head=insert_at_end(head,20);
        head=insert_at_end(head,30);
        head=insert_at_end(head,40);
        print(head);
        // (return 0 removed - Java main is void)
    }
}

