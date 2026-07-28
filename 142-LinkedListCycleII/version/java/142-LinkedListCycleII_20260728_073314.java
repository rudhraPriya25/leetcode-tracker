// Last updated: 7/28/2026, 7:33:14 AM
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
12    public ListNode sortList(ListNode head) {
13        if (head == null || head.next == null) return head;
14
15        // Step 1: Split list into two halves
16        ListNode slow = head, fast = head, prev = null;
17        while (fast != null && fast.next != null) {
18            prev = slow;
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        prev.next = null; // cut the list
23
24        // Step 2: Sort each half
25        ListNode l1 = sortList(head);
26        ListNode l2 = sortList(slow);
27
28        // Step 3: Merge sorted halves
29        return merge(l1, l2);
30    }
31
32    private ListNode merge(ListNode l1, ListNode l2) {
33        ListNode dummy = new ListNode(0);
34        ListNode curr = dummy;
35
36        while (l1 != null && l2 != null) {
37            if (l1.val < l2.val) {
38                curr.next = l1;
39                l1 = l1.next;
40            } else {
41                curr.next = l2;
42                l2 = l2.next;
43            }
44            curr = curr.next;
45        }
46
47        if (l1 != null) curr.next = l1;
48        if (l2 != null) curr.next = l2;
49
50        return dummy.next;
51    }
52}
53