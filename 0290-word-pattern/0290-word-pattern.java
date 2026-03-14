class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str= s.split(" ");
        if(str.length!=pattern.length()) return false;
        int[] idx = new int[256];
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String word= str[i];
            char c=pattern.charAt(i);
            int lastSeenchar= idx[c];
            int lastString = mp.getOrDefault(word,0);
            if(lastSeenchar!=lastString) return false;
            idx[c]=i+1;
            mp.put(word,i+1);
        }
    return true;

    }
}