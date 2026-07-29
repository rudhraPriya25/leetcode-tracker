// Last updated: 7/29/2026, 2:54:41 PM
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        if (root == null || root == p || root == q) {
4            return root;
5        }
6
7        TreeNode left = lowestCommonAncestor(root.left, p, q);
8        TreeNode right = lowestCommonAncestor(root.right, p, q);
9
10        if (left != null && right != null) {
11            return root; // split point → LCA
12        }
13        return (left != null) ? left : right;
14    }
15}
16