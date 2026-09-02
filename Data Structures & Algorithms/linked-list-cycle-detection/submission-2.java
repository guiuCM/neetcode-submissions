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
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next==null) return false;
        
        HashSet <ListNode> visited = new HashSet<>();

        while (head != null){
            if(visited.contains(head)) return true;
            visited.add(head);
            head = head.next;
        }

        return false;
    }
}
