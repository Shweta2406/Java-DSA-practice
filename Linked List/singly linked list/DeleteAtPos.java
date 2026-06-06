// Converted from C++ to Java
import java.util.*;

public class DeleteAtPos {




    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;

            next=null;
        }
    };

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(String.valueOf(curr.data) + " ");
            curr=curr.next;
        }System.out.println();
    }
    //abdul bari video
    Node delete_at_pos(Node head,int pos)
    {
        Node p;
        Node q;
        if(pos==1)
        {
            p=head;

            return head;
        }
        else{
            p=head;
            q=null;
            for(int i=0;i<pos-1 && p!=null;i++)
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

    public static void main(String[] args) 
    { 
    	Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;

    	temp1.next=temp2;

    	head=delete_at_pos(head,2);
    	printlist(head);
    	// (return 0 removed - Java main is void)
    } 

}



