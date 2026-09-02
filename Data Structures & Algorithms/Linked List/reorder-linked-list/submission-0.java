class Solution {
    public void reorderList(ListNode head) {
        // Base case: 0, 1, or 2 nodes don't need reordering
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        // STEP 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        // Fast moves 2 steps, slow moves 1 step.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse the second half of the list
        // 'slow' is currently at the middle. The second half starts at slow.next.
        ListNode second = slow.next;
        slow.next = null; // Break the list into two separate halves
        ListNode prev = null;
        
        // Standard linked list reversal
        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // STEP 3: Merge the two halves
        // 'first' points to the head of the first half.
        // 'second' (which is now 'prev') points to the head of the reversed second half.
        ListNode first = head;
        second = prev;

        while (second != null) {
            // Store the next nodes before we overwrite the pointers
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            // Link first node to second node
            first.next = second;
            // Link second node to the NEXT node of the first half
            second.next = tmp1;

            // Move pointers forward for the next iteration
            first = tmp1;
            second = tmp2;
        }
    }
}