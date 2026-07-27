// Last updated: 7/27/2026, 3:20:36 PM
1class Solution {
2    public void flatten(TreeNode root) {
3        if (root == null) return;
4
5        flatten(root.left);
6        flatten(root.right);
7
8        // Store right subtree
9        TreeNode tempRight = root.right;
10
11        // Move left subtree to right
12        root.right = root.left;
13        root.left = null;
14
15        // Attach original right subtree at the end
16        TreeNode curr = root;
17        while (curr.right != null) {
18            curr = curr.right;
19        }
20        curr.right = tempRight;
21    }
22}
23