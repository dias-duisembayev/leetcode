https://leetcode.com/problems/add-two-numbers/description/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var curr = new ListNode();
        var start = curr;
        var carry = 0;
        while(true) {
            int val1 = 0, val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            } 
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            } 

            var sum = val1 + val2 + carry;
            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            curr.val = sum;
            curr.next = new ListNode();
            var previous = curr;
            curr = curr.next;

            if (l1 == null && l2 == null) {
                if (carry == 1) {
                    curr.val = 1;
                } else {
                    previous.next = null;
                }
                return start;
            }
        }
    }
}
