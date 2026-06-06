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

public class Diameter {

    // The diameter of a tree (sometimes called the width) is the number
    // of nodes on the longest path between two end nodes.

    public int diameterOfBinaryTree(TreeNode root) {
        int[] d = new int[1];
        diameter(root, d);
        return d[0];
    }

    public int diameter(TreeNode root, int[] d) {
        if (root == null)
            return 0;
        else {
            int lh = diameter(root.left, d);
            int rh = diameter(root.right, d);
            d[0] = Math.max(d[0], lh + rh);
            return 1 + Math.max(lh, rh);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(60);
        root.right.left.left = new TreeNode(50);
        root.right.right.right = new TreeNode(70);

        Diameter solution = new Diameter();
        int diam = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter: " + diam);
    }
}
