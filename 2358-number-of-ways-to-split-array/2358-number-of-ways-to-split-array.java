class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }

 long currentsum=0; int count=0;
 for(int i=0;i<nums.length-1;i++){
    currentsum+=nums[i];
    long rem=totalsum-currentsum;
    if(currentsum>=rem){
        count++;
    }

 }
return count;
    }
}