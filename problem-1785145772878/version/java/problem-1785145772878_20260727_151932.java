// Last updated: 7/27/2026, 3:19:32 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
5        List<List<Integer>> result = new ArrayList<>();
6        dfs(root, targetSum, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void dfs(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> result) {
11        if (node == null) return;
12
13        path.add(node.val);
14
15        // Check if leaf and sum matches
16        if (node.left == null && node.right == null && targetSum == node.val) {
17            result.add(new ArrayList<>(path));
18        } else {
19            dfs(node.left, targetSum - node.val, path, result);
20            dfs(node.right, targetSum - node.val, path, result);
21        }
22
23        // Backtrack
24        path.remove(path.size() - 1);
25    }
26}
27