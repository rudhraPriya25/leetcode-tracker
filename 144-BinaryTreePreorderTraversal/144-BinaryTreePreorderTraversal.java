// Last updated: 7/28/2026, 4:02:43 PM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);          // Visit root
        preorder(node.left, result);   // Left
        preorder(node.right, result);  // Right
    }
}
