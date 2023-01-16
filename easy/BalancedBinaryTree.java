//link https://leetcode.com/problems/balanced-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        var max1 = findMax(root.left, 0);
        var max2 = findMax(root.right, 0);
        var diff = max1 - max2;
        if (diff > 1 || diff < -1) return false;
        return isBalanced(root.left)  && isBalanced(root.right);
    }

    public int findMax(TreeNode root, int max) {
        if (root == null) return max;
        max ++;
        if (root.right == null && root.left != null) {
            return findMax(root.left, max);
        } else if (root.right !=null && root.left == null) {
            return findMax(root.right, max);
        } else {
            var max1 = findMax(root.right, max);
            var max2 = findMax(root.left, max);
            return max1 > max2 ? max1 : max2;
        }
    }
}
