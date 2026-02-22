class Solution {
    public int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        int temp=n;
        while(temp>0){
            int dig = temp%2;
            sb.append(dig);
            temp/=2;
        }
        int max =0;
        int l=-1;
        String s = sb.reverse().toString();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(l!=-1){
                max=Math.max(max,i-l);
            }
            l=i;
            }
        }
        return max;
    }
}