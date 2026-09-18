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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // root and SubRoot null check also
        if(root == null) return false;
        if(subRoot == null) return false;
       
     return isSame(root , subRoot) || isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
    
    }
    boolean isSame(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        // dono mai se koi ek null aake jake to bhi false hoga
        //got it 
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSame(p.left , q.left) && isSame(p.right , q.right);
    }
}
