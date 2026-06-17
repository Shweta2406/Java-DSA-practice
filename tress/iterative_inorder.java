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

    public class iterative_inorder {

        //iterative approach to do inorder traversal of a binary tree
        static void inorder(Node root)
        {
            if(root==null)
                return;
            Stack<Node> stack=new Stack<>();
            Node curr=root;
            while(curr!=null || !stack.isEmpty())
            {
                while(curr!=null)
                {
                    stack.push(curr);
                    curr=curr.left;
                }
                curr=stack.pop();
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
        }

        public static void main(String[] args) {

        	Node root=new Node(10);
        	root.left=new Node(20);
        	root.right=new Node(30);
        	root.right.left=new Node(40);
        	root.right.right=new Node(50);

        	inorder(root);
        }
    }