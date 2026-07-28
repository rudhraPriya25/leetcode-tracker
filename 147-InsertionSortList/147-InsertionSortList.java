// Last updated: 7/28/2026, 4:02:36 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // dummy head
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = dummy;
            ListNode next = curr.next;

            // Find position to insert
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            // Move to next node
            curr = next;
        }

        return dummy.next;
    }
}
