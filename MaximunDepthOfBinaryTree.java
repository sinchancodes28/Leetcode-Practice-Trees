// LeetCode 104: Maximum Depth of Binary Tree
// Approach: Recursive DFS
// Time: O(n)
// Space: O(h), where h is the tree height
//code
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
