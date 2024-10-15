class Solution {
    public void rotate(int[] nums, int k) {
    //  7654321 -> 5674321  -> 5671234


        if(k>=nums.length) k=k%nums.length;
      reverse(0,nums.length-1,nums,k);
      reverse(0,k-1,nums,k);
      reverse(k,nums.length-1,nums,k);

    }
    public static void reverse(int start,int end,int nums[],int k){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}