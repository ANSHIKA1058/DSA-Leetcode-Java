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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans,list,targetSum,root);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> list,int targ,TreeNode root ){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==targ){
            ans.add(new ArrayList<>(list));
        }
        helper(ans,list,targ-root.val,root.left);
         helper(ans,list,targ-root.val,root.right);
         list.remove(list.size()-1);
    }
}