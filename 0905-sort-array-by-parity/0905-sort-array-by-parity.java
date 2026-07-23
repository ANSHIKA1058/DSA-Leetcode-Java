class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int start=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start+=1;
            }
        }
        return nums;
    }
}