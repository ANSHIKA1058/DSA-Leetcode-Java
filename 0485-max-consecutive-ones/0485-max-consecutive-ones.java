class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                st.add(1);
                count++;
              
            }else{
                count=0;
                st.clear();
            }
              max=Math.max(max,count);
        }
        return max;
    }
}