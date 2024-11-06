class Solution {
    public boolean canSortArray(int[] nums) {
        int max=nums[0],bits=count(nums[0]),lastmax=0;
        for(int i=1;i<nums.length;i++){
            boolean bitchange=bits!=count(nums[i]);
            if(bitchange)
                lastmax=max;
            if(nums[i]>max){
                max=nums[i];
                bits=count(nums[i]);
            }
            if(nums[i]<lastmax)
                return false;
        }
        return true;
        
    }
    private int count(int n){
        int c=0;
        while(n>0){
            c+=n&1;
            n=n>>1;
        }
        return c;
    }
}