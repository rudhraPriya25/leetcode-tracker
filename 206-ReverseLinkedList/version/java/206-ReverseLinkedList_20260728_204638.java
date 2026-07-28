// Last updated: 7/28/2026, 8:46:38 PM
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode prev = null;
4        ListNode curr = head;
5
6        while (curr != null) {
7            ListNode next = curr.next; // save next
8            curr.next = prev;          // reverse pointer
9            prev = curr;               // move prev forward
10            curr = next;               // move curr forward
11        }
12
13        return prev; // new head
14    }
15}
16