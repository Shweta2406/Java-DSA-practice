// Converted from C++ to Java
import java.util.*;

public class KthSmallest {

    //finding the Kth Smallest element in Binary Search Tree.

    static class Node  
    { 
      int key; 
      Node left; 
      Node right;
      int lCount;
      Node(int k){
          key=k;
          left=right=null;
          lCount=0;
      }
    };

    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new Node(x);

        if (x < root.key) {
            root.left = insert(root.left, x);
            root.lCount++;
        }

        else if (x > root.key)
            root.right = insert(root.right, x);
        return root;
    }

    public static Node kthSmallest(Node root, int k)
    {
        if (root == null)
            return null;

        int count = root.lCount + 1;
        if (count == k)
            return root;

        if (count > k)
            return kthSmallest(root.left, k);

        return kthSmallest(root.right, k - count);
    }

    public static void main(String[] args) {

    	Node root = null;
        int[] keys = { 20, 8, 22, 4, 12, 10, 14 };

        for (int x : keys)
            root = insert(root, x);

        int k = 4;
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.print("There are less than k nodes in the BST");
        else
            System.out.print("K-th Smallest Element is " + String.valueOf(res.key));
        // (return 0 removed - Java main is void)

    }

    //another method easy
    // void inorder(TreeNode root, List<Integer> v)
    //     {
    //         if(root!=null)
    //         {
    //             inorder(root.left,v);
    //             v.add(root.val);
    //             inorder(root.right,v);
    //         }
    //     }

    //     int kthSmallest(TreeNode root, int k) {
    //         List<Integer> v = new ArrayList<>();
    //         inorder(root,v);
    //         return v[k-1];

    //     }
}

