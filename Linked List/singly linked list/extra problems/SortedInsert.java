// Converted from C++ to Java
import java.util.*;

public class SortedInsert {


    class node {
        int data;
        node next;
        node(int x) {
            data = x;
            next = null;
        }
    };

    node sorted_insert(node head, int x) {
        node temp = new node(x);
        if (head == null || x < head.data) {
            temp.next = head;
            return temp;
        }
        else {
            node curr = head;
            while (curr.next != null && curr.next.data < x) {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            return head;
        }
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

        head = sorted_insert(head, 20); // Update the head pointer

        print(head);
        // (return 0 removed - Java main is void)
    }

}

