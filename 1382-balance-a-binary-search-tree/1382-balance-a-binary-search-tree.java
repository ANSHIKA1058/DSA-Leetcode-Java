class Solution {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode builder(int start, int last){
        if(start>last){
            return null;
        }
        int mid=(start+last)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left=builder(start,mid-1);
        root.right=builder(mid+1,last);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return builder(0,list.size()-1);
    }

}