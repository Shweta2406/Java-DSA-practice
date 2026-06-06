// Converted from C++ to Java
import java.util.*;

class PrintRightViewNode { 
      int key; 
      PrintRightViewNode left; 
      PrintRightViewNode right; 
      PrintRightViewNode(int k){
          key=k;
          left=right=null;
      }
    }

public class PrintRightView {


    public static void printright(PrintRightViewNode root){
        if(root==null)
        {
            return;
        }
            Queue<PrintRightViewNode> q = new LinkedList<>();
            q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                PrintRightViewNode curr=q.peek();
                q.poll();
                if(i==count-1)
                    System.out.print(String.valueOf(curr.key) + " ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {

    	PrintRightViewNode root=new PrintRightViewNode(10);
    	root.left=new PrintRightViewNode(20);
    	root.right=new PrintRightViewNode(30);
    	root.right.left=new PrintRightViewNode(40);
    	root.right.right=new PrintRightViewNode(50);

    	printright(root);
    }
}
