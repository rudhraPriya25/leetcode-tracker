// Last updated: 7/29/2026, 3:00:48 PM
1import java.util.*;
2
3class Solution {
4    public List<String> binaryTreePaths(TreeNode root) {
5        List<String> result = new ArrayList<>();
6        if (root != null) {
7            dfs(root, "", result);
8        }
9        return result;
10    }
11
12    private void dfs(TreeNode node, String path, List<String> result) {
13        if (node.left == null && node.right == null) {
14            result.add(path + node.val); // leaf → complete path
15        } else {
16            if (node.left != null) {
17                dfs(node.left, path + node.val + "->", result);
18            }
19            if (node.right != null) {
20                dfs(node.right, path + node.val + "->", result);
21            }
22        }
23    }
24}
25