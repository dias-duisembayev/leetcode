//link https://leetcode.com/problems/reverse-linked-list/description/

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
        var current = head;
        ListNode previous = null;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}
