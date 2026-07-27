// Last updated: 7/27/2026, 3:14:17 PM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5
6    private TreeNode build(int[] nums, int left, int right) {
7        if (left > right) return null;
8
9        int mid = left + (right - left) / 2; // middle element
10        TreeNode root = new TreeNode(nums[mid]);
11
12        root.left = build(nums, left, mid - 1);
13        root.right = build(nums, mid + 1, right);
14
15        return root;
16    }
17}
18