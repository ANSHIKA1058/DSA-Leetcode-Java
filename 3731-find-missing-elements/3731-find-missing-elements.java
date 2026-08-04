class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                int start= nums[i-1]+1;
                int end = nums[i]-1;
            for(int j=start;j<=end;j++){
            ans.add(j);
        }
            }
            }
            return ans;
    
    }
}