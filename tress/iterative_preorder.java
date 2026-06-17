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

public class iterative_preorder {
    
    //iterative approach to do preorder traversal of a binary tree
    static void preorder(Node root)
    {
        if(root==null)
            return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node curr=stack.pop();
            System.out.print(curr.data+" ");
            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);
        }
    }

    //iterative approach-space optimized
    //time complexity is O(n) and space complexity is O(h) where h is the height of the tree
    static void preorder2(Node root)
    {
        if(root==null)
            return;
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                System.out.print(curr.data+" ");
                if(curr.right!=null)
                    stack.push(curr.right);
                curr=curr.left;
            }
            if(!stack.isEmpty())
                curr=stack.pop();
        }
    }

    public static void main(String[] args) {

    	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);

    	preorder(root);
    	System.out.println();
    	preorder2(root);
    }
}