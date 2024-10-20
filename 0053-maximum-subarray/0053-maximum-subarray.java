class Solution {
    public int maxSubArray(int[] nums) {
    //   BRUTE FORCE ::  TC-O(N*N)
      
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//               int sum=0;
//               for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 maxsum=Math.max(sum,maxsum);
//               }
//         }
// return maxsum;
    
    
    
    // OPTIMAL  SOLUTION : KADAN'S ALGORITHM ::
    int max=Integer.MIN_VALUE;
        int sum=0;
    for(int i=0;i<nums.length;i++){
     sum+=nums[i];
     if(sum>max){
        max=sum;
     }
     if(sum<0) sum=0;
    }
    
    
    
    
    
    
 return max;   
    
    }
}