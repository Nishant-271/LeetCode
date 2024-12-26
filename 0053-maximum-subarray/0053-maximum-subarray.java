class Solution {
    public int maxSubArray(int[] nums) {
    //   BRUTE FORCE ::  TC-O(N*N)
//    int max=Integer.MIN_VALUE ;
//    for(int i=0;i<nums.length;i++){
//     int sum=0;
//     for(int j=i;j<nums.length;j++){
//         sum+=nums[j];
//         max=Math.max(max,sum);
//     }
//    }
//  return max;

    
    
//     // OPTIMAL  SOLUTION : KADAN'S ALGORITHM ::
  int max=Integer.MIN_VALUE;
  int sum=0;
  for(int i=0;i<nums.length;i++){
    sum+=nums[i];
    if(sum>max){
        max=sum;
    }
    if(sum<0)sum=0;
  }


return max;






// //  FOLLOW UP QUESTION :: Agar mujhe maximum sum vali subarrays ko bhi print krna hai 
// // toh main do pointers ko maintain krunga ek toh starting vala and ending vala aur 
// // vhi subarray hogi meri 
// // to solve this follow up question solve the problem on geekforgeek striver sheet.
 





    }
}