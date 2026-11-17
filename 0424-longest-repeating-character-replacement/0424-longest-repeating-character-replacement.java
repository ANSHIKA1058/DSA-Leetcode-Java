class Solution {
    public int characterReplacement(String s, int k) {
        int n =s.length();

        int maxlen=0;
        int maxfreq=0;

        int[] freq = new int[26];
        int l =0;
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            int windsize=r-l+1;
            if(windsize-maxfreq>k){
                 freq[s.charAt(l)-'A']--;
                l++;
               
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}