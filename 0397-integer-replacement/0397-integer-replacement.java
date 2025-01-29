class Solution {
    public int integerReplacement(int n) {
         if(n==Integer.MAX_VALUE){
            return 32;
         }
      return  dfs(n);
    }
    public static int dfs(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        

        if(n%2==0) return 1+dfs(n/2);
        else{
        
        return 1+Math.min(dfs(n-1),dfs(n+1));
        }
    }
}