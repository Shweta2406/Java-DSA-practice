// Converted from C++ to Java
import java.util.*;

class IsbalancedNode { 
      int key; 
      IsbalancedNode left; 
      IsbalancedNode right; 
      IsbalancedNode(int k){
          key=k;
          left=right=null;
      }
    }

public class Isbalanced {


    public static int height(IsbalancedNode root){
        if(root==null)
            // (return 0 removed - Java main is void)
        else
            return (1+Math.max(height(root.left),height(root.right)));
    }

    public static boolean isBalanced(IsbalancedNode root){
        if(root==null)
            return true;
        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static void main(String[] args) {

    	IsbalancedNode root=new IsbalancedNode(10);
    	root.left=new IsbalancedNode(5);
    	root.right=new IsbalancedNode(30);
    	root.right.left=new IsbalancedNode(15);
    	root.right.right=new IsbalancedNode(20);

    	System.out.print(isBalanced(root));
    }
}
