// Converted from C++ to Java
import java.util.*;

class LcaNode { 
      int key; 
      LcaNode left; 
      LcaNode right; 
      LcaNode(int k){
          key=k;
          left=right=null;
      }
    }

public class Lca {


    //lowest common ancestor
    LcaNode lca(LcaNode root, int n1, int n2){
        if(root==null)return null;
        if(root.key==n1||root.key==n2)
            return root;

        LcaNode lca1=lca(root.left,n1,n2);
        LcaNode lca2=lca(root.right,n1,n2);

        if(lca1!=null && lca2!=null)
            return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
    }

    public static void main(String[] args) {

    	LcaNode root=new LcaNode(10);
    	root.left=new LcaNode(20);
    	root.right=new LcaNode(30);
    	root.right.left=new LcaNode(40);
    	root.right.right=new LcaNode(50);
    	int n1=20,n2=50;

    	LcaNode ans=lca(root,n1,n2);
    	System.out.print("LCA: " + String.valueOf(ans.key));
    }
}
