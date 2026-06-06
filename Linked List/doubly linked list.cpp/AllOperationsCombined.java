// Converted from C++ to Java
import java.util.*;

public class AllOperationsCombined {

    //doubly linked list all operations

    class node{
        int data;
        node prv;
        node next;
        node(int x)
        {
            data=x;
            prv=null;
            next=null;
        }
    };

    node reverse(node head)
    {
        node temp=null;
        node curr=head;

        if(head==null || head.next==null)
       return null;

        while(curr!=null)
        {
            temp=curr.prv;
            curr.prv=curr.next;
            curr.next=temp;
            curr=curr.prv;
        }
        if(temp!=null)
        {
            head=temp.prv;
        }
        return head;

    }



    public static int search(node head,int x)
    {
        node temp=head;
        int pos=1;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                return pos;
            }
            else{
                pos++;
                temp=temp.next;
            }
        }
        return -1;
    }

    node insert_at_begin(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        {
            return temp;
        }
        temp.next=head;
        temp.prv=null;
        head.prv=temp;
        return temp;
    }

    node insert_at_pos(node head,int x,int pos)
    {
        node temp=new node(x);
        if(pos==1)
        {
            temp.next=head;
            if(head)
            {
                head.prv=temp;
            }
            return temp;
        }
        node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        return head;

        temp.next=curr.next;
        if(curr.next)
        {
            curr.next.prv=temp;
        }
        temp.prv=curr;
        curr.next=temp;
        return head;
    }

    node insert_at_end(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        {
            return temp;
        }
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.prv=curr;
        temp.next=null;
        return head;
    }

    node delete_at_begin(node head)
    {
        if(head==null)
        return null;
        if(head.next==null)
        {

            return null;
        }
        node p=head;
        head=head.next;

        return head;
    }

    node delete_at_pos(node head,int pos)
    {
        node p;
        node q;
        if(pos==1)
        {
            p=head;
            head=head.next;
            if(head)
            head.prv=null;

            return head;
        }
        else{
            p=head;
            q=null;
            for(int i=0;i<pos-1 && p!=null ;i++)
            {
                q=p;
                p=p.next;
            }

            if(p!=null)
            {
                q.next=p.next;
                if(p.next)
                {
                    p.next.prv=q;
                }

            }
         return head;

        }
    }


    node delete_at_end(node head)
    {
        if(head==null)
        return null;
        if(head.next==null)
        {

            return null;
        }
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.prv.next=null;

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
        System.out.println();
    }




    public static void main(String[] args)
    {
        node head=new node(2);
        head=insert_at_begin(head,1);
        head=insert_at_end(head,4);
        head=insert_at_end(head,5);
        head=insert_at_pos(head,3,3);
        System.out.print("linked list :");
        print(head);

        head=delete_at_begin(head);
        System.out.print("linked list :");
        print(head);

        head=insert_at_end(head,6);
        System.out.print("linked list :");
        print(head);



        head=delete_at_pos(head,3);
        System.out.print("linked list :");
        print(head);


        head=delete_at_end(head);
        System.out.print("linked list :");
        print(head);

        System.out.print("element 2 present in the linked list at index " + String.valueOf(search(head,2)));

        head=reverse(head);
        System.out.print("\nlinked list :");
        print(head);


        // (return 0 removed - Java main is void)


    }
}


