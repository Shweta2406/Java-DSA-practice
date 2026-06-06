// Converted from C++ to Java
import java.util.*;

class InorderNode {
        int key;
        InorderNode left;
        InorderNode right;
        InorderNode(int k)
        {
            key=k;
            left=right=null;
        }
    }

public class Inorder {


    public static void inorder(InorderNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(String.valueOf(root.key) + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        InorderNode root=new InorderNode(10);
        root.left=new InorderNode(20);
        root.right=new InorderNode(30);
        root.right.left=new InorderNode(40);
        root.right.right=new InorderNode(50);
        inorder(root);
        // (return 0 removed - Java main is void)
    }
}
