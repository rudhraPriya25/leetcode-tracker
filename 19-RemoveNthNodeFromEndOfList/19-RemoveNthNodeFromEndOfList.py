# Last updated: 7/20/2026, 10:15:00 AM
class Solution:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0, head)
        fast = slow = dummy

        # Step 1: Move fast n+1 steps ahead
        for _ in range(n + 1):
            fast = fast.next

        # Step 2: Move both pointers until fast reaches the end
        while fast:
            fast = fast.next
            slow = slow.next

        # Step 3: Remove the nth node
        slow.next = slow.next.next

        return dummy.next