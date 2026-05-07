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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();        
        int level = height(root)+1;
        if(root==null){
            return ans;
        }
        for(int i=1;i<=level;i++){
        List<Integer> list = new ArrayList<>();
        if(i%2!=0) nthLevel(root,i,list);
        else nthLevel2(root,i,list);
        ans.add(list);
        }
        return ans;
        
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthLevel(TreeNode root,int n, List<Integer> list){
        if(root==null) return;
        if(n==1){
            list.add(root.val);
            return;
        }
        nthLevel(root.left,n-1,list);
        nthLevel(root.right,n-1,list);
    }
    public void nthLevel2(TreeNode root,int n ,List<Integer> list){
        if(root==null){
            return;
        }
        if(n==1){
            list.add(root.val);
            return;
        }
        nthLevel2(root.right,n-1,list);
        nthLevel2(root.left,n-1,list);

    }
}