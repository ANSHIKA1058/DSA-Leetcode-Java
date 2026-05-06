/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==q){
            return p;
        }
        if(p==root || q==root){
            return root;
        }
        boolean leftp=contains(root.left,p);
        boolean rightq=contains(root.right,q);

        if((leftp && rightq) || (!leftp && !rightq)){
            return root;
        }
        if(leftp==true && rightq==false){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(leftp==false && rightq==true){
            return lowestCommonAncestor(root.right,p,q);
        }
        return null;
    }

    public boolean contains(TreeNode root,TreeNode p){
        if(root==p) return true;
        if(root==null) return false;
        return (contains(root.left,p)||contains(root.right,p));
    }
}