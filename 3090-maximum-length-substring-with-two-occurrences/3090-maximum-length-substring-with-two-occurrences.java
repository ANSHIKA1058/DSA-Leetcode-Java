class Solution {
    public int maximumLengthSubstring(String s) {
        int n =s.length();
        int[] freq = new int[26];
        int ans=0;
        int l=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}