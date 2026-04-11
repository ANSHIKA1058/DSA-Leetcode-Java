class Solution {
    public int[] asteroidCollision(int[] ast) {
        List<Integer> list = new ArrayList<>();
        int n =ast.length;


        for(int i:ast){
            list.add(i);
        }

        boolean change = true;
        while(change){
            change = false;
            for(int i=0;i<list.size()-1;i++){
                int a = list.get(i);
                int b = list.get(i+1);
                if(a>0 && b<0){
                    if(Math.abs(a)>Math.abs(b)){
                        list.remove(i+1);
                    }else if(Math.abs(a)==Math.abs(b)){
                        list.remove(i+1);
                        list.remove(i);
                    }else{
                        list.remove(i);
                    }
                       change = true;
                       break;
                
                }
             
            }
        }
        int[] res= new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

}