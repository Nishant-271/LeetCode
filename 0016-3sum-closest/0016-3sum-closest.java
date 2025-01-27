class Solution {
    public int threeSumClosest(int[] nums, int target) {
//              int close_sum=Integer.MAX_VALUE; int mindiff=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){
//             int currsum=nums[i]+nums[j]+nums[k];
//               int diff=Math.abs(currsum-target);
//              if(diff<mindiff){
//                 mindiff=diff;
//                 close_sum=currsum;
//              }
//                 }
//             }
//         }
//  return close_sum;
    
    int close_sum=Integer.MAX_VALUE; int mindiff=Integer.MAX_VALUE;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            int diff=Math.abs(sum-target);
            if(diff<mindiff){
                mindiff=diff;
                close_sum=sum;
            }
            if(sum==target) return sum;
            if(sum<target) left++;
            if(sum>target) right--;
        }
    }
    
    return close_sum;
    }
}