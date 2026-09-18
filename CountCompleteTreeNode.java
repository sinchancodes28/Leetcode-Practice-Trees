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
    public int countNodes(TreeNode root) {
        //calculate the left and right extreme nodes
        if(root == null) return 0;
        int leftmax = 0;
        int rightmax = 0;
        while(root.left != null){
            leftmax++;
            root.left = root.left.left;
        }
        while(root.right != null){
            rightmax++;
            root.right = root.right.right
        }
        if(leftmax == rightmax){
            return Math.pow(2 , rightmax) - 1;
        }
        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }
}
