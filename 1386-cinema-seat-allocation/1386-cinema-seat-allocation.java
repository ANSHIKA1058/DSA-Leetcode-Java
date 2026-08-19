class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> mp = new HashMap<>();
        for(int[] arr:reservedSeats){
            int row = arr[0];
            int val = arr[1];
            if(!mp.containsKey(row)){
                mp.put(row,new HashSet<>());
            }
            mp.get(row).add(val);
        }

        int ans = (n-mp.size())*2;

        for(int r:mp.keySet()){
            HashSet<Integer> st = mp.get(r);
            boolean l =true;
            boolean m = true;
            boolean ri= true;

            for(int i=2;i<=5;i++){
                if(st.contains(i)){
                    l=false;
                }
            }
            for(int i=4;i<=7;i++){
                if(st.contains(i)){
                    m=false;
                }
            }
            for(int i=6;i<=9;i++){
                if(st.contains(i)){
                    ri=false;
                }
            }

            if(l&&ri){
                ans+=2;
            }
            else if(l || ri || m){
                ans+=1;
            }

        }
        return ans;
    }
}