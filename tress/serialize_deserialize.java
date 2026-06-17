import java.util.*;

class Node { 
      int data; 
      Node left; 
      Node right; 
      Node(int k){
          data=k;
      }
    }

public class serialize_deserialize {

    //serailize means to convert a tree into a string and deserialize means to convert the string back to tree
    //preorder traversal is used to serialize the tree and -1 is used to indicate null nodes
    static List<Integer> serialize(Node root)
    {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            list.add(-1);
            return list;
        }
        list.add(root.data);
        list.addAll(serialize(root.left));
        list.addAll(serialize(root.right));

        return list;
    }

    //deserialize the list back to tree
    static int index=0;
    public static Node deserialize(List<Integer> list)
    {
        if(list.size()==index)
            return null;
        if(list.get(index)==-1)
        {
            index++;
            return null;
        }

        Node root=new Node(list.get(index));
        index++;
        root.left=deserialize(list);
        root.right=deserialize(list);
        return root;

    }

    static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {

    	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);

    	List<Integer> ans=serialize(root);
        System.out.println(ans);

        index=0;
        Node newRoot=deserialize(ans);
        inorder(newRoot);
    }


}