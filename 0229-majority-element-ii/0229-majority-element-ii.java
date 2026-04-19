class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int check = nums.length/3;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int a:nums){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        for(int k : mp.keySet()){
            int val = mp.get(k);
            if(val>check){
                list.add(k);
            }
        }
        return list;
    }
}