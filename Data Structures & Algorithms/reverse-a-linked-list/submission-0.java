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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // 1. Save the next node (so we don't lose the rest of the list)
            ListNode nextTemp = curr.next;
            
            // 2. Flip the pointer! (This is the reversal step)
            curr.next = prev;
            
            // 3. Move 'prev' and 'curr' one step forward
            prev = curr;
            curr = nextTemp;
        }

        // 'prev' will be pointing to the new head at the end
        return prev;
    }
}
