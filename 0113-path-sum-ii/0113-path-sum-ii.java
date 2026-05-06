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
        helper(ans,list,root,targetSum);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list, TreeNode root, int targ){
        if(root==null){
            return;
        }
        list.add(root.val);
        if( root.left==null && root.right==null && root.val==targ ){
            ans.add(new ArrayList<>(list));
        }else{
        helper(ans,list,root.left,targ-root.val);
        helper(ans,list,root.right,targ-root.val);
        }
        list.remove(list.size()-1);

    }
}