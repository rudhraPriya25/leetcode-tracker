// Last updated: 7/29/2026, 2:53:08 PM
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        while (root != null) {
4            if (p.val < root.val && q.val < root.val) {
5                root = root.left; // both in left
6            } else if (p.val > root.val && q.val > root.val) {
7                root = root.right; // both in right
8            } else {
9                return root; // split point → LCA
10            }
11        }
12        return null;
13    }
14}
15