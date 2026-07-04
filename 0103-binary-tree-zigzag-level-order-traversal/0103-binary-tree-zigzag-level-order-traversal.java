class Solution {

    public void nthLevel(TreeNode root,int i,List<Integer> list){
        if(root==null){
            return;
        }
        if(i==1){
            list.add(root.val);
            return;
        }
        nthLevel(root.left,i-1,list);
        nthLevel(root.right,i-1,list);
    }
     public void nthLevel2(TreeNode root,int i,List<Integer> list){
         if(root==null){
            return;
        }
        if(i==1){
            list.add(root.val);
            return;
        }
        nthLevel2(root.right,i-1,list);
        nthLevel2(root.left,i-1,list);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        int level= height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> list =new ArrayList<>();
            if(i%2!=0){
                nthLevel(root,i,list);
            }else{
                nthLevel2(root,i,list);
            }
            ans.add(list);
        }
        return ans;

    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));

    }
}