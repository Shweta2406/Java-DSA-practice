import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinarytreeToDoublylinkedlist {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Save both children before any rewiring
        TreeNode leftChild = root.left;
        TreeNode rightChild = root.right;

        // Wire prev's right to current node and current node's left to prev
        if (prev != null) {
            prev.right = root;
            root.left = prev;
        }
        prev = root;

        flatten(leftChild);
        flatten(rightChild);
    }

    public static void print(TreeNode head) {
        TreeNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(11);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(13);
        root.right = new TreeNode(14);

        BinarytreeToDoublylinkedlist solution = new BinarytreeToDoublylinkedlist();
        solution.flatten(root);
        print(root);
    }
}
