//link https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var nodes = new ArrayList<ListNode>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
