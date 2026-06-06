// Converted from C++ to Java
import java.util.*;

class PreorderNode {
        int key;
        PreorderNode left;
        PreorderNode right;
        PreorderNode(int k)
        {
            key=k;
            left=right=null;
        }
    }

public class Preorder {


    public static void preorder(PreorderNode root)
    {
        if(root!=null)
        {
            System.out.print(String.valueOf(root.key) + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        PreorderNode root=new PreorderNode(10);
        root.left=new PreorderNode(20);
        root.right=new PreorderNode(30);
        root.right.left=new PreorderNode(40);
        root.right.right=new PreorderNode(50);
        preorder(root);
        // (return 0 removed - Java main is void)
    }
}
