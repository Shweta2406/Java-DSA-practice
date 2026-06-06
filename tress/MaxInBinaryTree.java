// Converted from C++ to Java
import java.util.*;

class Node {
        int key;
        Node left;
        Node right;
        Node(int k)
        {
            key=k;
            left=right=null;
        }
    }

public class MaxInBinaryTree {

    //Largest Node(key) in a Tree is the maximum of the Tree.
    public static int max_height(Node root)
    {
        if(root==null)
        {
         // (return 0 removed - Java main is void)
         return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key,Math.max(max_height(root.left),max_height(root.right)));
        }
    }

    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.print(max_height(root));
        // (return 0 removed - Java main is void)
    }
}
