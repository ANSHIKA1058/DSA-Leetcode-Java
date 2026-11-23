class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        int maxfreq=0;
        int countfreq=0;

        for(int f:freq){
            if(f>maxfreq){
                maxfreq=f;
                countfreq=1;
            }else if(maxfreq==f){
                countfreq++;
            }
        }
        return Math.max(tasks.length,(maxfreq-1)*(n+1)+countfreq);
    }
}