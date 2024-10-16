class Solution {
    public int missingNumber(int[] nums) { 
        // int n=nums.length;
        // int sum1=n*(n+1)/2; int sum2=0;
        // for(int i:nums){
        // sum2+=i;
        // }  
        // return sum1-sum2;
 
        int n=nums.length;
 int xor1=0,xor2=0;
 for(int i=0;i<n;i++){
   xor1=xor1^nums[i];
   xor2=xor2^(i+1);
 }
    // xor2=xor2^n;
    return xor1^xor2;
    }
}