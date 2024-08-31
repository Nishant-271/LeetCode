class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int l=nums.length;
        int j=0;
        while(j<k)
        {
            int max=Integer.MAX_VALUE;
            int index=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]<max)
            {
                max=nums[i];
                index=i;
            }
        }
        nums[index]=nums[index]*multiplier;
        j++;

    }
    return nums;
}

}