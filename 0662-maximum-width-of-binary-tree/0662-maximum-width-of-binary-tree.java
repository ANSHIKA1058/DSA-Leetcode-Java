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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> idx =new LinkedList<>();
        q.add(root);
        idx.add(0);
        int maxWidth=0;
        while(!q.isEmpty()){
            int min=idx.peek();
            int first=0;
            int last =0;
            int size=q.size();
            TreeNode curr;
            for(int i=0;i<size;i++){
                curr=q.poll();
                int id=idx.poll()-min;
                if(i==0) first=id;
                if(i==size-1) last=id;

                if(curr.left!=null){
                    q.add(curr.left);
                    idx.add(2*id);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    idx.add(2*id+1);
                }
                maxWidth=Math.max(maxWidth,last-first+1);

            }
        }
        return maxWidth;
    }
}