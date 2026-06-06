// Converted from C++ to Java
import java.util.*;

public class Middle {


    class node {
        int data;
        node next;
        node(int x) {
            data = x;
            next = null;
        }
    };

    //middle of linked list
    //in case of even pprint 2nd node
    node middle(node head) 
    {
        if(head==null)
        // (return 0 removed - Java main is void)
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print("middle:" + String.valueOf(slow.data));
    }

    public static void print(node head) {
        node curr = head;
        while (curr != null) {
            System.out.print(String.valueOf(curr.data) + " ");
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
        node head = new node(11);
        node second = new node(22);
        node third = new node(33);
        head.next = second;
        second.next = third;
        third.next = null;
        print(head);
        middle(head);
        // (return 0 removed - Java main is void)
    }

}

