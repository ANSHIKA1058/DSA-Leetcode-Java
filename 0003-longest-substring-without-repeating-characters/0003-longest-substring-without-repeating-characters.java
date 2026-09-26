class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int max=0;
        int l=0;
        HashSet<Character> st = new HashSet<>();
        for(int r=0;r<n;r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            max =Math.max(max,r-l+1);
        }
        return max;
    }
}