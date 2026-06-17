import java.util.*;

class Node { 
      int data; 
      Node left; 
      Node right; 
      Node(int k){
          data=k;
          left=right=null;
      }
    }

//complete binary tree is a complete binary tree exceept last level is filled from left to right
public class count_nodes_in_complete_binary_tree {
    
    //naive approach is to do level order traversal and count the nodes
    // static int count(Node root)
    // {
    //     if(root==null)
    //         return 0;
    //     else
    //         return 1+count(root.left)+count(root.right);
    // }

    //efficient 
    //time complexity is O(logn*logn)
    static int count(Node root)
    {
        if(root==null)
            return 0;
        int lh=0,rh=0;
        Node curr=root;
        while(curr!=null)
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null)
        {
            rh++;
            curr=curr.right;
        }
        //if left height and right height are same then its a complete binary tree and number of nodes are 2^h-1
        if(lh==rh)
            return (int)(Math.pow(2,lh)-1);
        else
            return 1+count(root.left)+count(root.right);
    }

    public static void main(String[] args) {

    	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);

    	System.out.print(count(root));
    }

}
