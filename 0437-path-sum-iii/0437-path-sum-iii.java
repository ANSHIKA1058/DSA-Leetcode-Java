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
    HashMap<Long,Integer> mp = new HashMap<>();
    public int pathSum(TreeNode root, long targetSum) {
        mp.put(0L,1);
        return dfs(root,0L,targetSum);    
    }
    public int dfs(TreeNode root,long currSum,long targetSum){
        if(root==null){
            return 0;
        }
        currSum+=root.val;
        int count=mp.getOrDefault(currSum-targetSum,0);
        mp.put(currSum,mp.getOrDefault(currSum,0)+1);
        count+=dfs(root.left,currSum,targetSum);
        count+=dfs(root.right,currSum,targetSum);

        mp.put(currSum,mp.get(currSum)-1);
        return count;
    }
}