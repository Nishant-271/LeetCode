class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
       int max=0;
        int [] left=new int[n];
         int [] right=new int[n];
         left[0]=prices[0];
         right[n-1]=prices[n-1];

        //  For BUY ARRAY 
          for(int i=1;i<n;i++){
            left[i]=Math.min(left[i-1],prices[i]);
          }
        //  FOR SELL ARRAY :
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],prices[i]);
        }
        // MAX PROFIT BY DIFFER
        for(int i=0;i<n;i++){
            max=Math.max(max,right[i]-left[i]);
        }
 return max;
    }
}