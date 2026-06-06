import java.util.*;

public class Reverse {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}

