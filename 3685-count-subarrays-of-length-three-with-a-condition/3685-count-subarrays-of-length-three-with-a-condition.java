class Solution {
    public int countSubarrays(int[] nums) {
        int i=0;
        int j=2;
        int n=nums.length;
        int countSubarray=0;
        while(j<n){
            if(nums[j-1]%2==0){
            if(nums[i]+nums[j]==nums[j-1]/2){
                countSubarray++;
            }
            }
            i++;
            j++;
        }
        return countSubarray;
    }
}