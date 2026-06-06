// Converted from C++ to Java
import java.util.*;

public class DetectLoop {

    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Detect loop using Floyd's cycle detection algorithm
    public static boolean isLoop(Node head) {
        Node slow = head, fast = head;   // removed erroneous * from fast declaration

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;  // creates loop
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }
}
