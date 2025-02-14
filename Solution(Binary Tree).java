import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        inorderHelper(node.left, result); // Left
        result.add(node.val); // Root
        inorderHelper(node.right, result); // Right
    }

    // Driver code for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        System.out.println(sol.inorderTraversal(root)); // Output: [1, 3, 2]
    }
}
