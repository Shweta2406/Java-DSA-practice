// Converted from C++ to Java
import java.util.*;

public class DeleteAtBegin {




    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    };

    public static void printlist(Node head) {
        if (head == null) return;
        Node p = head;
        do {
            System.out.print(String.valueOf(p.data) + " ");
            p = p.next;
        } while (p != head);
    }

    // Node delete_at_begin(Node head) {
    //     if (head == null) return null;
    //     if (head.next == null) {
    //         // (memory managed by GC)
    //         return null;
    //     }
    //     Node curr = head;
    //     while (curr.next != head) {
    //         curr = curr.next;
    //     }
    //     curr.next = head.next;
    //     // (memory managed by GC)
    //     return curr.next;
    // }

    Node delete_at_begin(Node head) {
        if (head == null) return null;
        if (head.next == null) {
            // (memory managed by GC)
            return null;
        }
        head.data=head.next.data;
        Node temp=head.next;
        head.next=head.next.next;

        return head;
    }

    public static void main(String[] args) { 
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head = delete_at_begin(head);
        printlist(head);
        // (return 0 removed - Java main is void)
    }

}


