// Converted from C++ to Java
import java.util.*;

public class SearchRecursive {


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
        if(root==null)
        return false;

        if(x==root.data)
        return true;

        else if(x>root.data)
        return search(root.right,x);

        else
        return search(root.left,x);

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

