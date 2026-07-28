// Last updated: 7/28/2026, 4:04:00 PM
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        // Store right subtree
        TreeNode tempRight = root.right;

        // Move left subtree to right
        root.right = root.left;
        root.left = null;

        // Attach original right subtree at the end
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = tempRight;
    }
}
