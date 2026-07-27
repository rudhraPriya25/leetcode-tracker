// Last updated: 7/27/2026, 3:04:24 PM
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        if (n == 0) return new ArrayList<>();
4        return buildTrees(1, n);
5    }
6
7    private List<TreeNode> buildTrees(int start, int end) {
8        List<TreeNode> result = new ArrayList<>();
9        if (start > end) {
10            result.add(null);
11            return result;
12        }
13
14        for (int i = start; i <= end; i++) {
15            // Generate all left and right subtrees
16            List<TreeNode> leftTrees = buildTrees(start, i - 1);
17            List<TreeNode> rightTrees = buildTrees(i + 1, end);
18
19            // Combine them with root = i
20            for (TreeNode left : leftTrees) {
21                for (TreeNode right : rightTrees) {
22                    TreeNode root = new TreeNode(i);
23                    root.left = left;
24                    root.right = right;
25                    result.add(root);
26                }
27            }
28        }
29        return result;
30    }
31}
32