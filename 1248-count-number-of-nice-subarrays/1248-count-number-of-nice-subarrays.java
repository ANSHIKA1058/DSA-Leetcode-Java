class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        
        int oddc=0;
        int result =0;
        for(int n: nums){
            if(n%2!=0) oddc++;
            result += mp.getOrDefault(oddc-k,0);
            mp.put(oddc,mp.getOrDefault(oddc,0)+1);
        }
        return result;
    }
}