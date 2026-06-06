// Converted from C++ to Java
import java.util.*;

class Node {
        int data;
        Node left;
        Node right;
        Node(int k)
        {
            data=k;
            left=right=null;
        }
    }

public class LevelOrderTraversalLinebyline {


    public static void level_Order_Traversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                System.out.print(String.valueOf(curr.data) + " ");
                
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
         root.left.right=new Node(50);
         level_Order_Traversal(root);

        // (return 0 removed - Java main is void)


    }
}
