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

public class PrintNodesAtKDistance {

    //print nodes at distance k from root
    public static void printkdist(Node root,int k)
    {
        if(root==null)
        return;
        if(k==0)
        {
            System.out.print(String.valueOf(root.key) + " ");
        }
        else{
            printkdist(root.left,k-1);
            printkdist(root.right,k-1);
        }
    }








    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        printkdist(root,2);
        // (return 0 removed - Java main is void)
    }
}
