import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node() {}

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructBinaryTree {

    static int preIndex = 0;

    public Node buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            m.put(inorder[i], i);
        }
        return construct(inorder, preorder, 0, inorder.length - 1, m);
    }

    static Node construct(int[] inorder, int[] preorder, int is, int ie, Map<Integer, Integer> m) {
        if (is > ie)
            return null;

        Node root = new Node(preorder[preIndex++]);
        if (is == ie)
            return root;

        int inIndex = m.get(root.val);

        root.left = construct(inorder, preorder, is, inIndex - 1, m);
        root.right = construct(inorder, preorder, inIndex + 1, ie, m);
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] inorder = {20, 10, 40, 30, 50};
        int[] preorder = {10, 20, 30, 40, 50};

        ConstructBinaryTree solution = new ConstructBinaryTree();
        Node root = solution.buildTree(preorder, inorder);
        inorder(root);
    }
}
