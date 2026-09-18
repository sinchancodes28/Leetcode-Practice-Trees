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
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
    // after root all the left null then right skewed tree
        if(root.left == null) return 1 + right;
        // after root all the right null then left skewed tree
        if(root.right == null)return 1 + left;
        //otherwise return the min of both
        return 1 + Math.min(left , right);
    }
}
