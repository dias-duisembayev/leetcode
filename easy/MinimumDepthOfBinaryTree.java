//link https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

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
    public int minDepth(TreeNode root) {
        return findMin(root, 0);
    }

    public int findMin(TreeNode root, int min) {
        if (root == null) return min;
        min++;
        if (root.right == null && root.left != null) {
            return findMin(root.left, min);
        } else if (root.right !=null && root.left == null) {
            return findMin(root.right, min);
        } else {
            var min1 = findMin(root.right, min);
            var min2 = findMin(root.left, min);
            return min1 > min2 ? min2 : min1;
        }
    }
}
