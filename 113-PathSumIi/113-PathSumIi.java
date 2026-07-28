// Last updated: 7/28/2026, 4:04:02 PM
import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;

        path.add(node.val);

        // Check if leaf and sum matches
        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(path));
        } else {
            dfs(node.left, targetSum - node.val, path, result);
            dfs(node.right, targetSum - node.val, path, result);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}
