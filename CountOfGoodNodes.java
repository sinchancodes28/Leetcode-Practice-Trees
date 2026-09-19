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
 // maxsofar and root value compare then update maxsofar
class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return countGood(root, root.val);
    }

    private int countGood(TreeNode root, int maxSoFar) {
        if (root == null) return 0;

        int count = 0;

        if (root.val >= maxSoFar) {
            count = 1;
        }

        maxSoFar = Math.max(maxSoFar, root.val);

        return count
            + countGood(root.left, maxSoFar)
            + countGood(root.right, maxSoFar);
    }
}
