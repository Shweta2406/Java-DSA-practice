// Converted from C++ to Java
import java.util.*;

public class IsBst {


    static class Node  
    { 
      int key; 
      Node left;
      Node right; 
      Node(int k){
          key=k;
          left=right=null;
      }
    };

    public static boolean isBST(Node root,int min, int max)  
    {  
      if (root == null)  
        return true;  

      return ( root.key>min && root.key<max && 
                isBST(root.left,min,root.key) && isBST(root.right,root.key,max));  
    }

    public static void main(String[] args) {

    	Node root = new Node(4);  
        root.left = new Node(2);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);  

        if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))  
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");

        // (return 0 removed - Java main is void)  

    }
}

