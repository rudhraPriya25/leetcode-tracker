// Last updated: 7/27/2026, 3:07:39 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if (p == null && q == null) return true;
4        if (p == null || q == null) return false;
5        if (p.val != q.val) return false;
6
7        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
8    }
9}
10