//link https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        var current = head;
        while (current != null) {
            if (current.next == null) {
                return head;
            }
            if (current.val == current.next.val) {
                if (current.next.next == null) {
                    current.next = null;
                    return head;
                }
                current.next = current.next.next;      
            } else {
                current = current.next;
            }
            
        }
        return head;
    }
}
