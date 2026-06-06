// Converted from C++ to Java
import java.util.*;

public class AllOperationsCombined {

    //singly linked list all operations 

    class node {
        int data;
        node next;
        node(int x) {
            data = x;
            next = null;
        }
    };

    public static int search(node head,int x)
    {
        node curr=head;
        int pos=1;
        while(curr!=null)
        {
        if(curr.data==x)
        {
                return pos;

        }
        else
        {
        pos++;
        curr=curr.next;
        }
        }
        return -1;

    }

    node insert_at_begin(node head, int x) {
        node temp = new node(x);
        if (head == null) {
            return temp;
        }
        temp.next = head;
        return temp;
    }

    node insert_at_pos(node head,int pos,int x)
    {
        node temp=new node(x);
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        node curr=head;
        for(int i=1;i<pos-2;i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        {
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;

    }

    node insert_at_end(node head, int x) {
        node temp = new node(x);
        if (head == null) {
            return temp;
        }
        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    node delete_at_begin(node head) {
        if (head == null) {
            return null;
        } else {
            node p = head.next;

            return p;
        }
    }

    node delete_at_pos(node head,int pos)
    {
        node p;
        node q;
        if(pos==1)
        {
            p=head;

            return head;
        }
        else{
            p=head;
            q=null;
            for(int i=1;i<pos-1 && p!=null;i++)
            {
                q=p;
                p=p.next;
            }
            if(p!=null)
            {
            q.next=p.next;

            return head;
            }
        }
    }

    node delete_at_end(node head) {
        if (head == null || head.next == null) {

            return null;
        }
        node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

     node reverseList(node head)
        {
            // code here
            // return head of reversed list
           if(head==null || head.next==null)
           {
               return head;
           }
           node temp=reverseList(head.next);
           head.next.next=head;
           head.next=null;
           return temp;
        }

    public static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(String.valueOf(temp.data) + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node head = new node(10);
        head = insert_at_begin(head, 20);
        head = insert_at_end(head, 30);
        System.out.print("Linked list after initial insertion: ");
        print(head);

        System.out.print("Deleted node at beginning. New list: ");
        head = delete_at_begin(head);
        print(head);

        System.out.print("Inserted node at end again. New list: ");
        head = insert_at_end(head, 30);
        print(head);

        System.out.print("Deleted node at end. Final list: ");
        head = delete_at_end(head);
        print(head);

        head=insert_at_pos(head,2,20);
        System.out.print("Linked list after insertion: ");
        print(head);

        head=delete_at_pos(head,3);
        System.out.print("Linked list after deletion: ");
        print(head);

        head = reverseList(head);
        System.out.print("Reversed list: ");
        print(head);

         System.out.print("Position of element in Linked List: " + String.valueOf(search(head,30)));


        // (return 0 removed - Java main is void)
    }

}


