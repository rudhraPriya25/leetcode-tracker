// Last updated: 7/27/2026, 2:54:36 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode curr = head;
4
5        while (curr != null && curr.next != null) {
6            if (curr.val == curr.next.val) {
7                // Skip duplicate
8                curr.next = curr.next.next;
9            } else {
10                curr = curr.next; // move forward
11            }
12        }
13
14        return head;
15    }
16}
17