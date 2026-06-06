// Converted from C++ to Java
import java.util.*;

public class InsertRecursive {


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
        if(root==null)
        return new Node(x);
        if(x>root.key)
        {
            root.right=insert(root.right,x);
        }
        else if(x>root.key)
        {
            root.right=insert(root.right,x);
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

