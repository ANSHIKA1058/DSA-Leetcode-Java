class Solution {
    public int findFinalValue(int[] nums, int org) {
         HashSet<Integer> set = new HashSet<>();
         for(int i:nums){
            set.add(i);
         }
    
            while(set.contains(org)){
                org*=2;
            }
            return org;
    }
}