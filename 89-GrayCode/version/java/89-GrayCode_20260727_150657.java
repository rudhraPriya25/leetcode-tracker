// Last updated: 7/27/2026, 3:06:57 PM
1class Solution {
2    TreeNode first = null, second = null, prev = new TreeNode(Integer.MIN_VALUE);
3
4    public void recoverTree(TreeNode root) {
5        inorder(root);
6        // Swap values of the two nodes
7        int temp = first.val;
8        first.val = second.val;
9        second.val = temp;
10    }
11
12    private void inorder(TreeNode node) {
13        if (node == null) return;
14
15        inorder(node.left);
16
17        // Detect violation
18        if (prev.val > node.val) {
19            if (first == null) {
20                first = prev;
21            }
22            second = node;
23        }
24        prev = node;
25
26        inorder(node.right);
27    }
28}
29