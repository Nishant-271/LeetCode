class Solution {
    public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int num1=0,num2=0;
    num1=nums[0]*nums[1]*nums[nums.length-1];
    num2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    return Math.max(num1,num2);

    }  
}