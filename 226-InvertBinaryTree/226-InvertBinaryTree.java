// Last updated: 7/28/2026, 9:14:03 PM
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // Swap children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recurse
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
