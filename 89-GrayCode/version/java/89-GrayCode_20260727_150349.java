// Last updated: 7/27/2026, 3:03:49 PM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        inorder(root, result);
5        return result;
6    }
7
8    private void inorder(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        inorder(node.left, result);
11        result.add(node.val);
12        inorder(node.right, result);
13    }
14}
15