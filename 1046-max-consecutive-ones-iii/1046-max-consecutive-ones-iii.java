class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int zero_flip=0;
        int max_ones=0;
        for(int end=0;end<nums.length;end++){
              if(nums[end]==0){
                zero_flip++;
            
              }

              while(zero_flip>k){
                if(nums[start]==0){
                    zero_flip--;
                }
                start++;
              }

              max_ones=Math.max(max_ones,end-start+1);
        }
return max_ones;
    }
}