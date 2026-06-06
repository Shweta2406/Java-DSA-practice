// Converted from C++ to Java
import java.util.*;

public class SearchIterative {


    static class node
    {
        int data;
        node left, right;
        node(int x)
        {
            data=x;
            left=right=null;
        }
    };

    public static boolean search(node root,int x)
    {
        while(root!=null)
        {
            if(x==root.data)
            return true;

            else if(x>root.data)
            {
                root=root.right;
            }
            else
            {
                root=root.left;

            }
        }
                return false;


    }

    public static void main(String[] args)
    {
        node root=new node(10);
        root.right=new node(11);
        root.right.right=new node(12);
        root.left=new node(9);
        root.left.left=new node(8);
        int x=11;
        if(search(root,x))
        System.out.println("TRUE");
        else
        System.out.println("FALSE");

        // (return 0 removed - Java main is void)
    }
}

