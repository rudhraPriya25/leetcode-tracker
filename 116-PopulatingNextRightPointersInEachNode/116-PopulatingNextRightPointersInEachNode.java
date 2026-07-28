// Last updated: 7/28/2026, 4:03:56 PM
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftmost = root;

        while (leftmost.left != null) {
            Node head = leftmost;

            while (head != null) {
                // Connect left → right
                head.left.next = head.right;

                // Connect right → next left (if exists)
                if (head.next != null) {
                    head.right.next = head.next.left;
                }

                head = head.next; // move across the level
            }

            leftmost = leftmost.left; // move down one level
        }

        return root;
    }
}
