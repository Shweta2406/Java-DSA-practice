// Converted from C++ to Java
import java.util.*;

public class Deletion {


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

    public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x){
        if(root==null)
            return root;
        if(root.key>x)
            root.left=delNode(root.left,x);
        else if(root.key<x)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                Node temp=root.right;
                // (memory managed by GC)
                return temp;
            }
            else if(root.right==null){
                Node temp=root.left;
                // (memory managed by GC)
                return temp;
            }
            else{
                Node succ=getSuccessor(root);
                root.key=succ.key;
                root.right=delNode(root.right,succ.key);
            }
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
    	int x=15;

    	root=delNode(root,x);
    	inorder(root);
    }
}

