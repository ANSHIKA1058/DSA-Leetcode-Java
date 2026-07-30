class Solution {
    public String reorganizeString(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<int[]> maxh = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                maxh.offer(new int[]{i,freq[i]});
            }
        }
        StringBuilder ans = new StringBuilder();
        while(maxh.size()>1){
            int[] first = maxh.poll();
            int[] second = maxh.poll();
            ans.append((char)(first[0]+'a'));
             ans.append((char)(second[0]+'a'));
             first[1]--;
             second[1]--;

             if(first[1]>0){
                maxh.offer(first);
             }
             if(second[1]>0){
                maxh.offer(second);
             }
        }
        if(!maxh.isEmpty()){
            int[] last= maxh.poll();
            if(last[1]>1){
                return "";
            }
            ans.append((char)(last[0]+'a'));
        }
        return ans.toString();

    }
}