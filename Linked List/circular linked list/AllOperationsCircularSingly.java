// Converted from C++ to Java
import java.util.*;

public class AllOperationsCircularSingly {

    //all operations of circular singly linked list

    class node{
        int data;
        node next;
        node(int x)
        {
            data=x;
            next=null;
        }
    };

    public static int search(node head, int x) {
        if (head == null)
            return -1;

        node temp = head;
        int pos = 1;

        do {
            if (temp.data == x)
                return pos;

            temp = temp.next;
            pos++;
        } while (temp != head);

        return -1; // Element not found
    }


    node insert_at_begin(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        {
            temp.next=temp;
            return temp;
        }


        node curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=head;
        return temp;

    }

    node insert_at_pos(node head,int x,int pos)
    {
        node temp=new node(x);
        if(pos==1)
        {
            if(head==null)
            {
                temp.next=temp;
                return temp;
            }
            temp.next=head;
            node curr=head;
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=temp;
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
        curr.next=temp;
        return head;
    }

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
        }
    }

    node delete_at_begin(node head)
    {
        if(head==null)
        return null;
        if(head.next==null)
        {

            return null;
        }
        head.data=head.next.data;
        node p=head.next;
        head.next=head.next.next;

        return head;
    }

    node delete_at_pos(node head,int pos)
    {
        if(head==null)
            return head;

        if(pos==1)
        {
           delete_at_begin(head);
        }

            node curr=head;
            for(int i=1;i<pos-1;i++)
            {
               curr=curr.next;
            }

            node temp=curr.next;
            curr.next=curr.next.next;

         return head;


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
        while(curr.next.next!=head)
        {
            curr=curr.next;
        }

        curr.next=head;
        return head;

    }



    public static void print(node head)
    {
         if (head == null) return;
        node temp=head;
       do
        {
            System.out.print(String.valueOf(temp.data) + " ");
            temp=temp.next;
        } while(temp!=head);
    }




    public static void main(String[] args) {
        node head = null;

        // Testing insert_at_begin function
        head = insert_at_begin(head, 10);
        head = insert_at_begin(head, 20);
        head = insert_at_begin(head, 30);

        System.out.print("Circular Linked List after insert_at_begin: ");
        print(head);
        System.out.println();

        // Testing insert_at_pos function
        head = insert_at_pos(head, 25, 2);

        System.out.print("Circular Linked List after insert_at_pos: ");
        print(head);
        System.out.println();

        // Testing insert_at_end function
        head = insert_at_end(head, 40);

        System.out.print("Circular Linked List after insert_at_end: ");
        print(head);
        System.out.println();

        // Testing delete_at_begin function
        head = delete_at_begin(head);

        System.out.print("Circular Linked List after delete_at_begin: ");
        print(head);
        System.out.println();

        // Testing delete_at_pos function
        head = delete_at_pos(head, 2);

        System.out.print("Circular Linked List after delete_at_pos: ");
        print(head);
        System.out.println();

        // Testing delete_at_end function
        head = delete_at_end(head);

        System.out.print("Circular Linked List after delete_at_end: ");
        print(head);
        System.out.println();

          // Testing searching function


        System.out.print("element 25 present at index: " + String.valueOf(search(head,25)));
        System.out.println();

        // (return 0 removed - Java main is void)
    }

}


