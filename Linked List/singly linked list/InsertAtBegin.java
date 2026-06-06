// Converted from C++ to Java
import java.util.*;

public class InsertAtBegin {


    class node{
        int data;
        node next;
    };

     node head=null;

    public static void insert_begin(int x)
    {
     node temp=new node();
     temp.data=x;
     temp.next=head;
     head=temp;
    }

    public static void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(String.valueOf(temp.data) + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
       insert_begin(10);
       insert_begin(20);
       insert_begin(30);
       insert_begin(40);
       insert_begin(50);
       print();
    }
}

