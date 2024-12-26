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
//  int buy=prices[0];
//  int profit=0;
//  for(int i=1;i<prices.length;i++){
//     if(prices[i]<buy) buy=prices[i];
//     profit=Math.max(profit,prices[i]-buy); 
//  }
//    return profit;

// OPTIMAL SECOND WAY ::
int n=prices.length;
int max=0;
int left[]=new int[n];
int right[]=new int[n];
left[0]=prices[0];
right[n-1]=prices[n-1];

//  for buy maintain the array of left 
for(int i=1;i<n;i++){
    left[i]=Math.min(left[i-1],prices[i]);
}
System.out.print(Arrays.toString(left));
//  for sell maintain the array of right 
for(int i=n-2;i>0;i--){
    right[i]=Math.max(right[i+1],prices[i]);
}
System.out.print(Arrays.toString(right));


// FINDING THE MAX PROFIT 

for(int i=0;i<n;i++){
    max=Math.max(max,right[i]-left[i]);
}
return max;
    }
}