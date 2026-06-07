// Converted from C++ to Java
import java.util.*;

class Node { 
      int key; 
      Node left; 
      Node right; 
      Node(int k){
          key=k;
          left=right=null;
      }
    }

public class Lca {


    //lowest common ancestor
    static Node lca(Node root, int n1, int n2){
        if(root==null)return null;
        if(root.key==n1||root.key==n2)
            return root;

        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);

        if(left!=null && right!=null)
            return root;
        if(left!=null)
            return left;
        else
            return right;
    }

    public static void main(String[] args) {

    	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	int n1=20,n2=50;

    	Node ans=lca(root,n1,n2);
    	System.out.print("LCA: " + String.valueOf(ans.key));
    }
}
