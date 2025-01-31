class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftmax[]=new int[nums.length];
        int rightmin[]=new int[nums.length];
        leftmax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            leftmax[i]=Math.max(nums[i],leftmax[i-1]);
        }
        rightmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightmin[i]=Math.min(nums[i],rightmin[i+1]);
        }
 for(int i=0;i<nums.length-1;i++){
    if(leftmax[i]<=rightmin[i+1]){
        return i+1;
    }
 }

return -1;
    }
}