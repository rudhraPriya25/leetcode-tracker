// Last updated: 7/28/2026, 7:31:50 AM
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        postorder(root, result);
5        return result;
6    }
7
8    private void postorder(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        postorder(node.left, result);   // Left
11        postorder(node.right, result);  // Right
12        result.add(node.val);           // Root
13    }
14}
15