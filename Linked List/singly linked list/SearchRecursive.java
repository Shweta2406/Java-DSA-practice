// Converted from C++ to Java
import java.util.*;

public class SearchRecursive {


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

    public static int search_recursive(node head,int x)
    {
        if(head==null)
        return -1;
        if(head.data==x)
        return 1;
        else
        {
            int res=search_recursive(head.next,x);
            if(res==-1)
            return -1;
            else
            return res+1;
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

        System.out.print("Position of element in Linked List: " + String.valueOf(search_recursive(head,20)));
        // (return 0 removed - Java main is void)
    }
}

