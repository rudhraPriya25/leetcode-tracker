// Last updated: 7/28/2026, 7:32:47 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13        if (head == null) return null;
14
15        ListNode dummy = new ListNode(0); // dummy head
16        ListNode curr = head;
17
18        while (curr != null) {
19            ListNode prev = dummy;
20            ListNode next = curr.next;
21
22            // Find position to insert
23            while (prev.next != null && prev.next.val < curr.val) {
24                prev = prev.next;
25            }
26
27            // Insert curr between prev and prev.next
28            curr.next = prev.next;
29            prev.next = curr;
30
31            // Move to next node
32            curr = next;
33        }
34
35        return dummy.next;
36    }
37}
38