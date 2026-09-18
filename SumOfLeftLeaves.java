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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null ) return 0;
    // node's left is not null but node's left's left and right is null then add in sum traverse in both leftSub tree and rightSubtree
        int sum = 0;
        TreeNode node = root;
        if(node.left != null && node.left.left == null && node.left.right == null){
             sum += node.left.val;
        }
        return sum +  sumOfLeftLeaves(root.left)
           +  sumOfLeftLeaves(root.right);
    }
}
