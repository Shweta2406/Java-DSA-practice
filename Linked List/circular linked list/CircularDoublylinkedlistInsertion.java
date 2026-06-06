// Converted from C++ to Java
import java.util.*;

public class CircularDoublylinkedlistInsertion {




    class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    };

    public static void printlist(Node head){
        if(head==null)return;
        Node p=head;
        do{
            System.out.print(String.valueOf(p.data) + " ");
            p=p.next;
        }while(p!=head);
    }

    Node insert_At_Head(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }


    Node insert_At_end(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;
    }


    public static void main(String[] args) 
    { 
    	Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
    	head=insert_At_Head(head,5);
        head=insert_At_end(head,55);
    	printlist(head);
    	// (return 0 removed - Java main is void)
    } 

}

