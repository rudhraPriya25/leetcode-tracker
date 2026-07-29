// Last updated: 7/29/2026, 2:51:33 PM
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        if (head == null || head.next == null) return true;
4
5        // Step 1: Find middle
6        ListNode slow = head, fast = head;
7        while (fast != null && fast.next != null) {
8            slow = slow.next;
9            fast = fast.next.next;
10        }
11
12        // Step 2: Reverse second half
13        ListNode secondHalf = reverse(slow);
14
15        // Step 3: Compare halves
16        ListNode firstHalf = head;
17        ListNode temp = secondHalf;
18        while (temp != null) {
19            if (firstHalf.val != temp.val) return false;
20            firstHalf = firstHalf.next;
21            temp = temp.next;
22        }
23
24        return true;
25    }
26
27    private ListNode reverse(ListNode head) {
28        ListNode prev = null, curr = head;
29        while (curr != null) {
30            ListNode nextNode = curr.next;
31            curr.next = prev;
32            prev = curr;
33            curr = nextNode;
34        }
35        return prev;
36    }
37}
38