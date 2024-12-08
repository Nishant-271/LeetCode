class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int [n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                res[i]=nums[i];
            }
            if(nums[i]>0)
            {
                res[i]=nums[(i+nums[i])%n];
            }
            else if(nums[i]<0)
            {
                int r=(Math.abs(nums[i]))/n;
                res[i]=nums[Math.abs((i+nums[i]+r*n+n))%n];
            }
        }
        return res;


        
    }
}