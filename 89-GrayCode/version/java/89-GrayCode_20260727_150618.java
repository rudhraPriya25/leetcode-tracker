// Last updated: 7/27/2026, 3:06:18 PM
1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
4    }
5
6    private boolean validate(TreeNode node, long min, long max) {
7        if (node == null) return true;
8
9        if (node.val <= min || node.val >= max) return false;
10
11        return validate(node.left, min, node.val) &&
12               validate(node.right, node.val, max);
13    }
14}
15