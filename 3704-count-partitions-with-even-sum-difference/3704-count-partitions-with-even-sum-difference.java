class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int leftsum=0,total=0;
        int count=0;
        for(int i:nums) total+=i;
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            int right=total-leftsum;
            if((leftsum-right)%2==0) count++;
        }
 return count;
    }
}