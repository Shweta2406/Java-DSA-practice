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
        {
            temp.next=temp;
            return temp;
        }
        else{
            node curr=head;
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
            return head;
            // temp.next=head.next;
            // head.next=temp;
            // int t=head.data;
            // head.data=temp.data;
            // temp.data=t;
            // return temp;
        }
    }

    public static void print(node head)
    {
        if(head==null)
        return;
       node temp=head;
      do{
          System.out.print(String.valueOf(temp.data) + " ");
          temp=temp.next;
      }while(temp!=head);
    }

    public static void main(String[] args)
    {
        node head=null;
        head=insert_at_end(head,10);
        head=insert_at_end(head,11);
        print(head);
        // (return 0 removed - Java main is void)
    }
}

