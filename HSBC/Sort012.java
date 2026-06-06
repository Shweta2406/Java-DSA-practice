import java.util.*;

public class Sort012 {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node insert_at_end(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(String.valueOf(temp.data) + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void sort(Node head){
        int[] count={0,0,0};
        Node curr=head;
        while(curr!=null)
        {
            count[curr.data]++;
            curr=curr.next;
        }
        int i=0;
        curr=head;
        while(curr!=null){
            if(count[i]==0){
                i++;
            }
            else{
                curr.data=i;
                count[i]--;
                curr=curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(0);

        head = insert_at_end(head, 0);
        head = insert_at_end(head, 2);
        head = insert_at_end(head, 1);
        head = insert_at_end(head, 2);
        print(head);
        sort(head);
        print(head);
    }

}

