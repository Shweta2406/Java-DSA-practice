// Converted from C++ to Java
import java.util.*;

public class InsertIterative {


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

    public static Node insert(Node root, int x){
        Node temp=new Node(x);
        Node curr, parent;
        parent=null;
        curr=root;
        while(curr!=null)
        {
            parent=curr;
            if(x>curr.key)
            {
                curr=curr.right;
            }
            else if(x<curr.key)
            {
                curr=curr.left;
            }
            else
            return root;
        }
        if(parent==null)
        return temp;
        else if(x>parent.key)
        {
            parent.right=temp;
        }
        else{
            parent.left=temp;
        }
        return root;
    } 

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(String.valueOf(root.key) + " ");
            inorder(root.right);    
        }
    } 
    public static void main(String[] args) {

    	Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=20;

    	root=insert(root,x);
    	inorder(root);
    }
}

