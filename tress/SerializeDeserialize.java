// Converted from C++ to Java
import java.util.*;

class SerializeDeserializeNode { 
      int key; 
      SerializeDeserializeNode left; 
      SerializeDeserializeNode right; 
      SerializeDeserializeNode(int k){
          key=k;
          left=right=null;
      }
    }

public class SerializeDeserialize {


    static final int EMPTY=-1;
    public static void serialize(SerializeDeserializeNode root, List<Integer> arr){
       if(root==null){
           arr.add(EMPTY);
           return;
       }
        arr.add(root.key);
        serialize(root.left,arr);
        serialize(root.right,arr);
    }

    SerializeDeserializeNode deSerialize(List<Integer> arr, int[] index){
        if(index[0] == arr.size())
            return null;
        int val=arr[index[0]];
        index[0]++;
        if(val==EMPTY)return null;
        SerializeDeserializeNode root=new SerializeDeserializeNode(val);
        root.left=deSerialize(arr,index);
        root.right=deSerialize(arr,index);
        return root;
    }

    public static void inorder(SerializeDeserializeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(String.valueOf(root.key) + " ");
            inorder(root.right);    
        }
    } 

    public static void main(String[] args) {

    	SerializeDeserializeNode root=new SerializeDeserializeNode(10);
    	root.left=new SerializeDeserializeNode(20);

    	List<Integer> arr = new ArrayList<>();
    	serialize(root,arr);
    	for (int x : arr) {
    	    System.out.print(String.valueOf(x) + " ");
    	}
    	System.out.println();
    	int[] index = {0};
    	SerializeDeserializeNode root_new=deSerialize(arr,index);
    	inorder(root_new);
    }
}
