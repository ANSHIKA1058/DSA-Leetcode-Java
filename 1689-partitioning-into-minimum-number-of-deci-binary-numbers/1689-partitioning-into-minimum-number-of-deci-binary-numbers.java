class Solution {
    public int minPartitions(String n) {
        int maxDigit=0;
        for(int i=0;i<n.length();i++){
            int dig = n.charAt(i)-'0';
            maxDigit = Math.max(dig,maxDigit);
            if(maxDigit==9){
                return 9;
            }
        }
        return maxDigit;
    }
}