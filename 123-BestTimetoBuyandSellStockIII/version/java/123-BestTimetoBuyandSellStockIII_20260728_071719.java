// Last updated: 7/28/2026, 7:17:19 AM
1class Solution {
2    private int maxSum;
3
4    public int maxPathSum(TreeNode root) {
5        maxSum = Integer.MIN_VALUE;
6        dfs(root);
7        return maxSum;
8    }
9
10    private int dfs(TreeNode node) {
11        if (node == null) return 0;
12
13        // Only take positive gains (ignore negative paths)
14        int leftGain = Math.max(dfs(node.left), 0);
15        int rightGain = Math.max(dfs(node.right), 0);
16
17        // Path through this node
18        int currentPath = node.val + leftGain + rightGain;
19
20        // Update global max
21        maxSum = Math.max(maxSum, currentPath);
22
23        // Return max gain to parent
24        return node.val + Math.max(leftGain, rightGain);
25    }
26}
27