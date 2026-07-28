// Last updated: 7/28/2026, 4:03:25 PM
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        if (node == null) return 0;

        currentSum = currentSum * 10 + node.val;

        // If leaf, return the number formed
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // Otherwise, sum from left + right
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }
}
