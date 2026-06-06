// Converted from C++ to Java
import java.util.*;

class InorderPreorderPostorderNode {
        int data;
        InorderPreorderPostorderNode left;
        InorderPreorderPostorderNode right;
        InorderPreorderPostorderNode(int x)
        {
            data=x;
            left=right=null;
        }
    }

public class InorderPreorderPostorder {


    //binary tree traversal -inorder,preorder,postorder


    public static void inorder(InorderPreorderPostorderNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(String.valueOf(root.data) + " ");
            inorder(root.right);
        }
    }

    public static void postorder(InorderPreorderPostorderNode root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
          System.out.print(String.valueOf(root.data) + " ");

        }
    }

    public static void preorder(InorderPreorderPostorderNode root)
    {
        if(root!=null)
        {
            System.out.print(String.valueOf(root.data) + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        InorderPreorderPostorderNode root=new InorderPreorderPostorderNode(10);
        root.left=new InorderPreorderPostorderNode(20);
        root.right=new InorderPreorderPostorderNode(30);
        root.left.left=new InorderPreorderPostorderNode(40);
        root.left.right=new InorderPreorderPostorderNode(50);
        root.left.right.left=new InorderPreorderPostorderNode(70);
        root.left.right.right=new InorderPreorderPostorderNode(80);
        root.right.right=new InorderPreorderPostorderNode(60);
        inorder(root);
        System.out.println();
        preorder(root);
            System.out.println();

        postorder(root);
            System.out.println();

        // (return 0 removed - Java main is void)

    }
}
