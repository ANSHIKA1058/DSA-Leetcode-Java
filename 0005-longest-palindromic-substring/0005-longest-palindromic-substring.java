class Solution {
    public String longestPalindrome(String s) {
        int n =s.length();
        int max=0;
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            String sub =s.substring(i,j+1);
            if(ispalindrome(sub)){
               if(sub.length()>max){
                max=sub.length();
                ans = sub;
               }
            }
        }
        }
        return ans;
    }
    public boolean ispalindrome(String sub){
        int i=0;
        int j =sub.length()-1;
        while(i<j){
            if(sub.charAt(i)!=sub.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
return true;

    }
}