class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String s :strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
           String k = new String(c);
           if(!mp.containsKey(k)){
            mp.put(k,new ArrayList<>());
           }
           mp.get(k).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}