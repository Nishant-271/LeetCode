class Solution {
    public int maxProduct(int[] nums) {
    // BRUTE FORCE WAY O(N*N) 

//  int max=Integer.MIN_VALUE;
//  for(int i=0;i<nums.length;i++){
//     int mul=1;
//     for(int j=i;j<nums.length;j++){
//        mul*=nums[j];
//        max=Math.max(max,mul);
//     }
//  }
// return max;

//   OPTIMAL ONE ::

  int prefix=1,suffix=1;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<nums.length;i++){
   if(prefix==0) prefix=1;
   if(suffix==0) suffix=1;
  
   prefix=prefix*nums[i];
   suffix=suffix*nums[nums.length-i-1];
   max=Math.max(max,Math.max(prefix,suffix));
  
  }

return max;
        }
}