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
 */class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base case
        if (root == null) return false;

        // Check if trees are same at current node
        if (isSameTree(root, subRoot)) return true;

        // Otherwise check left and right
        return isSubtree(root.left, subRoot) || 
               isSubtree(root.right, subRoot);
    }

    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both are null
        if (p == null && q == null) return true;

        // If one is null or values differ
        if (p == null || q == null || p.val != q.val) return false;

        // Check left and right
        return isSameTree(p.left, q.left) && 
               isSameTree(p.right, q.right);
    }
}