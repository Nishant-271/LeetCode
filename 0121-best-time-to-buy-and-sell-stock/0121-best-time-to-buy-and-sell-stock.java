class Solution {
    public int maxProfit(int[] prices) {
  
//   BRUTE FORCE :: TLE CODE 
  
    // int max=0;
    // for(int i=0;i<prices.length;i++){
    //     for(int j=i+1;j<prices.length;j++){
    //         max=Math.max(max,prices[j]-prices[i]);
    //     }
    // }
    // return max;

// OPTIMAL ONE way  ::
 int buy=prices[0];
 int profit=0;
 for(int i=1;i<prices.length;i++){
    if(prices[i]<buy) buy=prices[i];
    profit=Math.max(profit,prices[i]-buy); 
 }
   return profit;

    }
}