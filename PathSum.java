class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
      //agar root hi null to false 
        if (root == null) {
            return false;
        }
// if single root then targetSum == root then return false
      if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }
}
