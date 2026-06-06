// Converted from C++ to Java
import java.util.*;

public class InsertAtPos {


    class node {
        int data;
        node next;
        node(int x) {
            data = x;
            next = null;
        }
    };

    node insert_at_pos(node head,int pos, int x)
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

    node insert_at_end(node head, int x) {
        node temp = new node(x);
        if (head == null) {
            temp.next = temp; // Point to itself to form a circular list
            return temp;
        }

        node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static void print(node head) {
        if (head == null) {
            return;
        }
        node temp = head;
        do {
            System.out.print(String.valueOf(temp.data) + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        node head = null;
        head = insert_at_end(head, 10);
        head = insert_at_end(head, 20);
        head = insert_at_end(head, 30);
        head = insert_at_end(head, 40);
        head = insert_at_pos(head, 2, 25);
        print(head);
        // (return 0 removed - Java main is void)
    }

}

