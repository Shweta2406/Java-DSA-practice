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

public class SizeOfBinaryTree {

    //Size of Binary Tree is the total numbers of nodes present in that Tree.


    public static int size(Node root)
    {
        if(root==null)
        {
         // (return 0 removed - Java main is void)
         return 0;
        }
        else{
            return size(root.left)+ size(root.right)+1;
        }
    }

    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.print(size(root));
        // (return 0 removed - Java main is void)
    }
}
