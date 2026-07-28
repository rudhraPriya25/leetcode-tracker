// Last updated: 7/28/2026, 7:31:27 AM
1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        preorder(root, result);
5        return result;
6    }
7
8    private void preorder(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        result.add(node.val);          // Visit root
11        preorder(node.left, result);   // Left
12        preorder(node.right, result);  // Right
13    }
14}
15