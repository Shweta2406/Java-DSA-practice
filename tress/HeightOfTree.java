import java.util.*;

class HeightOfTreeNode {
    int key;
    HeightOfTreeNode left;
    HeightOfTreeNode right;

    HeightOfTreeNode(int k) {
        key = k;
        left = right = null;
    }
}

public class HeightOfTree {

    public static int height(HeightOfTreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        HeightOfTreeNode root = new HeightOfTreeNode(10);
        root.left = new HeightOfTreeNode(20);
        root.right = new HeightOfTreeNode(30);
        root.right.left = new HeightOfTreeNode(40);
        root.right.right = new HeightOfTreeNode(50);
        System.out.print(height(root));
    }
}
