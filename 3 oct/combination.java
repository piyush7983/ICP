class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> al =new ArrayList<>();
        List<Integer> l =new ArrayList<>();
         helper(1,n,k,al,l);
         return al;
    }
    public void helper(int a,int n, int k,List<List<Integer>> al,List<Integer> l){
        if(k==0 ) {
            al.add(new ArrayList<>(l));
            return ;
            
        }
        if(a==n+1){
            return;
        }

        for(int i=a;i<=n;i++){
            l.add(i);

            helper(i+1,n,k-1,al,l);

            l.remove(l.size()-1);
        }    

            
        

    }
}
    