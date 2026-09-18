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
 // maximum sum of height of left and right subtree passes from any node
 // no need to be only the root node 
 // diameter store hoga gobal max mai and jaise hi height calculate hogi bo return krega us node ki height ko 
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        levels(root);
        return diameter;
    }
    int levels( TreeNode root){
        if(root == null) return 0;
        int leftlevel = levels(root.left);
        int rightlevel = levels(root.right);
        diameter = Math.max(diameter , leftlevel + rightlevel);
        return 1 + Math.max(leftlevel , rightlevel);
    }
}
