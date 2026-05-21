class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        // String rev = new StringBuilder(str).reverse().toString();
     
        // return str.equals(rev);
        String st = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return isPal(st,0,st.length()-1);
    }
    public boolean isPal(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return isPal(s,l+1,r-1);
    }
}