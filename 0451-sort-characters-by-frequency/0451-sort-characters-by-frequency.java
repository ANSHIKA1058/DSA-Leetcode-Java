import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxheap= new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(char a:mp.keySet()){
            maxheap.offer(a);
        }

        StringBuilder sb = new StringBuilder();
        while(!maxheap.isEmpty()){
            char ch = maxheap.poll();
            int freq= mp.get(ch);
            while(freq>0){
                sb.append(ch);
                freq--;
            }
        }
        return sb.toString();
    }
}