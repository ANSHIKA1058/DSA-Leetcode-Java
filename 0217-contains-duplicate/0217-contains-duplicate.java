class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int k:mp.keySet()){
            int v = mp.get(k);
            if(v>1){
                return true;
            }
        }
        return false;
    }
}