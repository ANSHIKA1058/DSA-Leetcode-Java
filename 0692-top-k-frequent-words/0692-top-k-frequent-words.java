class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        HashMap<String,Integer> mp = new HashMap<>();
        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        List<String> list = new ArrayList<>(mp.keySet());
        Collections.sort(list,(a,b)->{
        if(mp.get(b).equals(mp.get(a))){
            return a.compareTo(b);
        
        } 
        return mp.get(b)-mp.get(a);});
        return list.subList(0,k);
    }
}