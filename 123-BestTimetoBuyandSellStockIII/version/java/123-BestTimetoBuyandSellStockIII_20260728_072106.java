// Last updated: 7/28/2026, 7:21:06 AM
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return dfs(root, 0);
4    }
5
6    private int dfs(TreeNode node, int currentSum) {
7        if (node == null) return 0;
8
9        currentSum = currentSum * 10 + node.val;
10
11        // If leaf, return the number formed
12        if (node.left == null && node.right == null) {
13            return currentSum;
14        }
15
16        // Otherwise, sum from left + right
17        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
18    }
19}
20