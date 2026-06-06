// Converted from C++ to Java
import java.util.*;

public class PairSum {


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

    public static void treeToList(Node root, List<Integer> list) 
        { 
            if (root == null) 
                return; 

            treeToList(root.left, list); 
            list.add(root.key); 
            treeToList(root.right, list); 
        }

    public static boolean isPairPresent(Node root, int target) 
        { 
            List<Integer> a2 = new ArrayList<>(); 

            treeToList(root, a2); 

            int start = 0; 

            int end = a2.size() - 1;  

            while (start < end) { 

                if (a2[start] + a2[end] == target)  
                { 
                    System.out.print("Pair Found: " + String.valueOf(a2[start]) + " + " + String.valueOf(a2[end]) + " " + "= " + String.valueOf(target));
                    return true; 
                } 

                if (a2[start] + a2[end] > target) // decrements end 
                { 
                    end--; 
                } 

                if (a2[start] + a2[end] < target) // increments start 
                { 
                    start++; 
                } 
            } 

            System.out.print("No such values are found!");
            return false; 
        } 

    public static void main(String[] args) {

    	Node root = new Node(10);  
        root.left = new Node(8);  
        root.right = new Node(20);  
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);  
        root.right.right.left = new Node(25);

        int sum=33;

        isPairPresent(root,sum);

        // (return 0 removed - Java main is void)  

    }
}

