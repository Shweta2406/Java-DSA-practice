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

public class SpiralTraversal {

    /*
    public static void printSpiral(Node root){
        if(root==null)return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
            Node curr=q.peek();
            q.poll();
            if(reverse)
                s.push(curr.key);
            else
                System.out.print(String.valueOf(curr.key) + " ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            }
            if(reverse){
                while(s.isEmpty()==false){
                    System.out.print(String.valueOf(s.peek()) + " ");
                    s.pop();
                }
            }
        reverse=!reverse;
        }
    }
    */

    public static void printSpiralTwoStacks(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>(); // current level
        Stack<Node> s2 = new Stack<>(); // next level

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node node = s1.pop();
                System.out.print(node.key + " ");
                if (node.right != null) s2.push(node.right);
                if (node.left != null) s2.push(node.left);
            }
            while (!s2.isEmpty()) {
                Node node = s2.pop();
                System.out.print(node.key + " ");
                if (node.left != null) s1.push(node.left);
                if (node.right != null) s1.push(node.right);
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printSpiralTwoStacks(root);
    }
}
