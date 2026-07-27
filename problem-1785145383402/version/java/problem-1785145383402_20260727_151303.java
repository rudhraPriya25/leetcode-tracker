// Last updated: 7/27/2026, 3:13:03 PM
1import java.util.*;
2
3class Solution {
4    private Map<Integer, Integer> inorderMap;
5    private int postIndex;
6
7    public TreeNode buildTree(int[] inorder, int[] postorder) {
8        inorderMap = new HashMap<>();
9        postIndex = postorder.length - 1;
10
11        // Store inorder values with their indices
12        for (int i = 0; i < inorder.length; i++) {
13            inorderMap.put(inorder[i], i);
14        }
15
16        return build(postorder, 0, inorder.length - 1);
17    }
18
19    private TreeNode build(int[] postorder, int left, int right) {
20        if (left > right) return null;
21
22        // Root from postorder
23        int rootVal = postorder[postIndex--];
24        TreeNode root = new TreeNode(rootVal);
25
26        // Split inorder into left and right subtrees
27        int inorderIndex = inorderMap.get(rootVal);
28
29        // Build right subtree first, then left
30        root.right = build(postorder, inorderIndex + 1, right);
31        root.left = build(postorder, left, inorderIndex - 1);
32
33        return root;
34    }
35}
36