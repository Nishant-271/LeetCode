class Solution {
    public int longestSubarray(int[] nums) {
        int maximum=nums[0];
        //calculating the maximum...
        for(int num:nums){
            if(num>maximum)maximum=num;
        }
        int start=0;
        int end=0;
        int count=0;
        //finding number of times maximum is present in sequence ....
        while(end<nums.length){
            if(nums[end]!=maximum){
                start=end;
                end++;
                start++;
            }
            else{
                end=end+1;
                count=Math.max(count,end-start);
            }
        }
        return count;
    }
}