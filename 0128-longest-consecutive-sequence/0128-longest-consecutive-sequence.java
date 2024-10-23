class Solution {
   
  
//  BRUTE FORCE :: TC : O(N*N) ::::::
    // public int longestConsecutive(int[] nums) {
//   int longest=0;
  
//   for(int i=0;i<nums.length;i++){
//     int count=1;
//     int x=nums[i];
//     while(search(nums,x+1)==true){
//         x=x+1;
//         count++;
//     }
//      longest=Math.max(longest,count);     
//   }

// return longest;
//     }
// public static boolean search(int nums[],int number){
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]==number){
//             return true;
//         }
//     }
// return false;

// }

//  BETTER SOLUTION :::::

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
   int last_smaller=Integer.MIN_VALUE;
   int currlength=0;
   int maxlength=0;
   for(int i=0;i<nums.length;i++){
    if(nums[i]-1==last_smaller){
        currlength++;
        last_smaller=nums[i];
    }
    // else if(nums[i]==last_smaller){
    //     continue;
    // }
    else if(last_smaller!=nums[i]){
        currlength=1;
        last_smaller=nums[i];
    }
    maxlength=Math.max(maxlength,currlength);
   }

return maxlength;
    }
}
