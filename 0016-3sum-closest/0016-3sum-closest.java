class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //brute fore
        int n = nums.length;

        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-sum)<Math.abs(target-closest)){
                        closest=sum;
                    }
                }
            }
        }
        return closest;
    }
}