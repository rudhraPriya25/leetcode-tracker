// Last updated: 7/28/2026, 9:15:20 PM
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Step 1: Create a dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Use two pointers
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node with matching value
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        // Step 3: Return the new head
        return dummy.next;
    }
}
