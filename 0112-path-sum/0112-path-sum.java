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
    public boolean hasPathSum(TreeNode root, int t) {
        List<Integer> list = new ArrayList<>();
        return check(list,root,t);
    }
    public boolean check(List<Integer> list,TreeNode root,int t){
        if(root==null){
            return false;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
             list.remove(list.size() - 1);
            if(sum==t){
                return true;
            }else{
                return false;
            }
        }
        boolean left =check(list,root.left,t);
        boolean right=check(list,root.right,t);
         list.remove(list.size() - 1);
        return left||right; 

    }

}