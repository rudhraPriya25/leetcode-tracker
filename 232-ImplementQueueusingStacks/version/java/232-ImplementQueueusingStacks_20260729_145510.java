// Last updated: 7/29/2026, 2:55:10 PM
1class Solution {
2    public void deleteNode(ListNode node) {
3        // Step 1: Copy value from next node
4        node.val = node.next.val;
5        // Step 2: Skip the next node
6        node.next = node.next.next;
7    }
8}
9