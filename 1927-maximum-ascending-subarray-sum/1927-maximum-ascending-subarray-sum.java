class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int currsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
            currsum+=nums[i];
          max=Math.max(max,currsum);
}else{
    currsum=nums[i];
      }

        }
        return max;
    }
}