//link https://leetcode.com/problems/diameter-of-binary-tree/description/

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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int c = getPathLength(root);
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        if (c >= l && c >= r) return c;
        if (l >= c && l >= r) return l;
        return r;       
    }

    public int getPathLength(TreeNode root) {
        int leftLength = getLength(root.left, 0);
        int rightLength = getLength(root.right, 0);
        return leftLength + rightLength;
    }

    public int getLength(TreeNode root, int length) {
        if (root == null) return length;
        length++;
        if (root.right == null && root.left != null) return getLength(root.left, length);
        if (root.right != null && root.left == null) return getLength(root.right, length);
        var l = getLength(root.left, length);
        var r = getLength(root.right, length);
        return l > r ? l : r;
    } 
}
