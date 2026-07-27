// Last updated: 7/27/2026, 3:12:05 PM
1import java.util.*;
2
3class Solution {
4    private Map<Integer, Integer> inorderMap;
5    private int preorderIndex;
6
7    public TreeNode buildTree(int[] preorder, int[] inorder) {
8        inorderMap = new HashMap<>();
9        preorderIndex = 0;
10
11        // Store inorder values with their indices
12        for (int i = 0; i < inorder.length; i++) {
13            inorderMap.put(inorder[i], i);
14        }
15
16        return build(preorder, 0, inorder.length - 1);
17    }
18
19    private TreeNode build(int[] preorder, int left, int right) {
20        if (left > right) return null;
21
22        // Root from preorder
23        int rootVal = preorder[preorderIndex++];
24        TreeNode root = new TreeNode(rootVal);
25
26        // Split inorder into left and right subtrees
27        int inorderIndex = inorderMap.get(rootVal);
28
29        root.left = build(preorder, left, inorderIndex - 1);
30        root.right = build(preorder, inorderIndex + 1, right);
31
32        return root;
33    }
34}
35