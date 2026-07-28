// Last updated: 7/28/2026, 7:30:35 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null || head.next == null) return null;
15
16        ListNode slow = head;
17        ListNode fast = head;
18
19        // Step 1: Detect cycle
20        while (fast != null && fast.next != null) {
21            slow = slow.next;
22            fast = fast.next.next;
23
24            if (slow == fast) {
25                // Step 2: Find cycle start
26                ListNode ptr1 = head;
27                ListNode ptr2 = slow;
28                while (ptr1 != ptr2) {
29                    ptr1 = ptr1.next;
30                    ptr2 = ptr2.next;
31                }
32                return ptr1; // cycle start
33            }
34        }
35
36        return null; // no cycle
37    }
38}
39