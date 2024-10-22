class Solution {
    public int[] rearrangeArray(int[] nums) {
       
    //    BRUTE FORCE ::::
       
//         int plus[] =new int[nums.length/2];
//         int minus[] =new int[nums.length/2];
//        int p=0; int m=0;
//      for(int i=0;i<nums.length;i++){
//         if(nums[i]>0){
//             plus[p++]=nums[i];
//         }
//         else{
//             minus[m++]=nums[i];
//         }
//     }
//       for(int i=0;i<nums.length/2;i++){
//         nums[2*i]=plus[i];
//         nums[(2*i)+1]=minus[i];
//       }

// return nums;
    
//   OPTIMAL SOMEWHAT :: 

int even=0; int odd=1;
int ans[]=new int[nums.length];
for(int i=0;i<nums.length;i++){
    if(nums[i]>0){
        ans[even]=nums[i];
        even+=2;
    }
    else{
        ans[odd]=nums[i];
        odd+=2;
    }
}


    return ans;
    }
}