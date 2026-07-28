// Last updated: 7/28/2026, 4:03:36 PM
class Solution {
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // Only take positive gains (ignore negative paths)
        int leftGain = Math.max(dfs(node.left), 0);
        int rightGain = Math.max(dfs(node.right), 0);

        // Path through this node
        int currentPath = node.val + leftGain + rightGain;

        // Update global max
        maxSum = Math.max(maxSum, currentPath);

        // Return max gain to parent
        return node.val + Math.max(leftGain, rightGain);
    }
}
