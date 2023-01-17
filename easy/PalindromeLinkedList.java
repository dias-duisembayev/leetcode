//link https://leetcode.com/problems/palindrome-linked-list/description/

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
    public boolean isPalindrome(ListNode head) {
        var copy = head;
        var tail = reverseList(copy);
        while (head != null) {
            if (head.val != tail.val) return false;
            head = head.next;
            tail = tail.next;
        }
        return head == tail;
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            var current = new ListNode(head.val, previous);
            previous = current;
            head = head.next;
        }
        return previous;
    }
}
