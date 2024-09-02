class Solution {
    public int maximumWealth(int[][] accounts) {
     int max=0;
     for(int ind[] :accounts){
        int sum=0;
        for(int i:ind){
            sum+=i;
        }
        max=Math.max(sum,max);
     }
     return max;
         }
}