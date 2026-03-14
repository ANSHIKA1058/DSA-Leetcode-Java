class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int n :nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int need = nums.length/2;
        for(int k : mp.keySet()){
            int v = mp.get(k);
            if(v>need){
                return k;
            }
        }
        return -1;

    }
}