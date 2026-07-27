// Last updated: 7/27/2026, 3:15:30 PM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root) != -1;
4    }
5
6    private int height(TreeNode node) {
7        if (node == null) return 0;
8
9        int left = height(node.left);
10        int right = height(node.right);
11
12        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
13            return -1; // imbalance detected
14        }
15
16        return 1 + Math.max(left, right);
17    }
18}
19
20