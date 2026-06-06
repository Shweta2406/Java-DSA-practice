// Converted from C++ to Java
import java.util.*;

public class RemoveDuplicatesSorted {

    //Remove duplicates from a sorted Singly Linked List

    // Linked list Node
    class Node {
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data = d;
    		next = null;
    	}
    };
    public static void removeDuplicates(Node head)
    {
    	Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                Node temp=curr.next;
                curr.next=curr.next.next;

            }
            else{
                curr=curr.next;
            }
        }
    }

    Node push(Node head, int new_data)
    {
    	Node new_node = new Node(new_data);
    	new_node.next = head;
    	head = new_node;
    	return head;
    }
    public static void printList(Node head)
    {
    	Node temp = head;
    	while (temp != null) {
    		System.out.print(String.valueOf(temp.data) + " ");
    		temp = temp.next;
    	}
    	System.out.println();
    }

    public static void main(String[] args)
    {
    	Node llist = null;
    	llist = push(llist, 20);
    	llist = push(llist, 13);
    	llist = push(llist, 13);
    	llist = push(llist, 11);
    	llist = push(llist, 11);
    	llist = push(llist, 11);
    	System.out.print(("List before removal of duplicates\n"));
    	printList(llist);
    	System.out.print(("List after removal of elements\n"));
    	removeDuplicates(llist);
    	printList(llist);
    }

}


