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

public class LevelOrderTraversal {

    //breadth first search in tree
    public static void level_order_traversal(Node root)
    {
        if(root==null)
        return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(q.isEmpty()!=true)
        {
          Node curr= q.poll();

          System.out.print(String.valueOf(curr.key) + " ");

          if(curr.left!=null)
          q.offer(curr.left);

          if(curr.right!=null)
          q.offer(curr.right);

        }

    }
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        level_order_traversal(root);
        // (return 0 removed - Java main is void)
    }
}
