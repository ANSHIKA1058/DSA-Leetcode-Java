class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> mp = new HashMap<>();
        for(int[] arr: reservedSeats){
            int row = arr[0];
            int seats= arr[1];
            if(!mp.containsKey(row)){
                mp.put(row,new HashSet<>());
            }
            mp.get(row).add(seats);
        }
        //non reserveds
        int ans =(n-mp.size())*2;
        for(int r:mp.keySet()){
            HashSet<Integer> st = mp.get(r);
            //left 2 3 4 5
            boolean l=true;
            boolean m=true;
            boolean right=true;
            for(int i=2;i<=5;i++){
                if(st.contains(i)){
                    l=false;
                }
            }

            //middle 4 5 6 7
            for(int i=4;i<=7;i++){
                if(st.contains(i)){
                    m=false;
                }
            }

            //right 6 7 8 9
            for(int i=6;i<=9;i++){
                if(st.contains(i)){
                    right=false;
                }
            }

            if(l && right){
                ans+=2;
            }
            else if( l || m || right){
                ans+=1;
            }
        }
        return ans;
    }
}