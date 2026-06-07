import java.util.*;
class Node { 
      int key; 
      Node left; 
      Node right; 
      Node(int k){
          key=k;     
     }
    }

//min time to burn tree from given node
//algo
//1. find parent of each node and store in map
//2. find target node
//3.do bfs to burn all adjacent nodes of target node and keep track of time taken to burn all nodes

public class min_time_to_burn_tree_from_given_node {

    //find parent of each node and store in map
    //find target node
    static Node findTargetNode(Node root, int target, Map<Node, Node> parentMap){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        parentMap.put(root,null);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            //check if current node is target node
            if(curr.key==target)
                return curr;
            if(curr.left!=null){
                q.offer(curr.left);
                parentMap.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.offer(curr.right);
                parentMap.put(curr.right,curr);
            }
        }
        return null;
    }

    //burn tree logic
    static int burnTree(Node target, Map<Node, Node> parentMap){
        int time=0;
        int flag=0;
        Map<Node,Boolean> visited=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        while(q.isEmpty()==false)
        {
            int size=q.size();
            //to burn all adjacent nodes of current node
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                //check left child
                if(temp.left!=null && visited.get(temp.left)==null)
                {
                    q.offer(temp.left);
                    visited.put(temp.left,true);
                    flag=1;
                }
                //check right child
                if(temp.right!=null && visited.get(temp.right)==null)
                {
                    q.offer(temp.right);
                    visited.put(temp.right,true);
                    flag=1;
                }

                //check parent node
                Node parent=parentMap.get(temp);
                if(parent!=null && visited.get(parent)==null)
                {
                    q.offer(parent);
                    visited.put(parent,true);
                    flag=1;
                }
            }
            if(flag==1)
                time++;
             flag=0;
        }

        return time;
    }

    //main function to find minimum time to burn tree from given node
    static int minTimeToBurn(Node root, int target) {
        if (root == null) {
            return -1;
        }
        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = findTargetNode(root, target, parentMap);
        if (targetNode == null) {
            return -1;
        }
        return burnTree(targetNode, parentMap);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example binary tree:
        //         1
        //        / \
        //       2   3
        //      / \   \
        //     4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print("Enter the target node key: ");
        int target = scanner.nextInt();

        int result = minTimeToBurn(root, target);
        if (result >= 0) {
            System.out.println("Minimum time to burn the tree from node " + target + " is " + result);
        } else {
            System.out.println("Target node " + target + " not found in the tree.");
        }

        scanner.close();
    }
}
