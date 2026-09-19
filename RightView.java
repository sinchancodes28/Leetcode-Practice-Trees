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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root , ans , 0);
        return ans;
    }
    void dfs(TreeNode root , List<Integer> ans , int level){
        if(root == null) return ;
        // yaha level ko pass krna pdega 
        // variable ke form mai yeh baar baar intialise hoga 
       // int level = 0;
        if(level == ans.size()){
            ans.add(root.val);
         
        }
      dfs(root.right , ans , level + 1);
      dfs(root.left , ans , level + 1);
    }
}
