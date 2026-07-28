// Last updated: 7/28/2026, 4:04:09 PM
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1; // imbalance detected
        }

        return 1 + Math.max(left, right);
    }
}

