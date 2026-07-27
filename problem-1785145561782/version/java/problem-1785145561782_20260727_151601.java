// Last updated: 7/27/2026, 3:16:01 PM
1class Solution {
2    public int minDepth(TreeNode root) {
3        if (root == null) return 0;
4
5        if (root.left == null) return 1 + minDepth(root.right);
6        if (root.right == null) return 1 + minDepth(root.left);
7
8        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
9    }
10}
11