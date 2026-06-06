// Converted from C++ to Java
import java.util.*;

class PostorderNode {
        int key;
        PostorderNode left;
        PostorderNode right;
        PostorderNode(int k)
        {
            key=k;
            left=right=null;
        }
    }

public class Postorder {


    public static void postorder(PostorderNode root)
    {
        if(root!=null)
        {

            postorder(root.left);
            postorder(root.right);
            System.out.print(String.valueOf(root.key) + " ");
        }
    }

    public static void main(String[] args)
    {
        PostorderNode root=new PostorderNode(10);
        root.left=new PostorderNode(20);
        root.right=new PostorderNode(30);
        root.right.left=new PostorderNode(40);
        root.right.right=new PostorderNode(50);
        postorder(root);
        // (return 0 removed - Java main is void)
    }
}
