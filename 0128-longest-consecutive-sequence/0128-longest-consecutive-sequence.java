class Solution {
    
    // BRUTE FORCE :: O(N*N) 
//     public int longestConsecutive(int[] nums) {
      
//         int max=0;
//     for(int i=0;i<nums.length;i++){
//         int count=1;
//         int x=nums[i];
//         while(search(nums,x+1)){
//             x=x+1;
//             count++;
//         }
//         max=Math.max(max,count);
//     }  
//   return max;
// }


// public static boolean search(int nums[],int val){
//     for(int i:nums){
//         if(i==val) return true;
//     }
//     return false;
// }




//  BETTER SOLUTION ::
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int max=0; int count=0;int prev=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]-1==prev){
            count++;
            prev=nums[i];
        }
        else if(nums[i]==prev) continue;
        else if(nums[i]!=prev){
            count=1;
            prev=nums[i];
        }
        max=Math.max(count,max);
    }
return max;
    }










}
