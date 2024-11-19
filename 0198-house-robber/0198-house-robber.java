class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
            
  return maxrob(nums);
    }

    public static int maxrob(int nums[]){
         int dp[]=new int[nums.length];
         dp[0]=nums[0];
         int max=0;
         dp[1]=Math.max(nums[0],nums[1]);
         for(int i=2;i<nums.length;i++){
            int take=nums[i]+dp[i-2];
            int nottake=0+dp[i-1];
            dp[i]=Math.max(take,nottake);
         }                            
return dp[nums.length-1];
    }

}