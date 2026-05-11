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
    public boolean hasPathSum(TreeNode root, int targ) {
     if(root==null){
        return false; 
     }   
     if((root!=null) && (root.left==null && root.right==null)){
        if(root.val==targ){
        return true;
     }
     }
     return hasPathSum(root.left,targ-root.val)||hasPathSum(root.right,targ-root.val);
    }
}