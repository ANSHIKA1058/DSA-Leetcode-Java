class Solution {
    public int maxVowels(String s, int k) {
        
        int count=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        int max=count;
    
        for(int i=1;i<=s.length()-k;i++){
            if(count>0){
            if(s.charAt(i-1)=='a' || s.charAt(i-1)=='e' || s.charAt(i-1)=='i' || s.charAt(i-1)=='o' || s.charAt(i-1)=='u') count--;
            }
            if(s.charAt(i-1+k)=='a' || s.charAt(i-1+k)=='e' || s.charAt(i-1+k)=='i' || s.charAt(i-1+k)=='o' || s.charAt(i-1+k)=='u') count++;
            
            
              max=Math.max(max,count);
        }
        return max;
    }
}