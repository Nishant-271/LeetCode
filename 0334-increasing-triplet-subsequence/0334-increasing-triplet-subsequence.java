class Solution {
    public boolean increasingTriplet(int[] nums) {
// BRUTE FORCE ::::::::::

    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             for(int k=j+1;k<nums.length;k++){
    //                 if(nums[i] < nums[j] &&  nums[j]<nums[k]){
    //                     return true;
    //                 }
    //              }
    //         }
    //     }
    // return false;
    
//   OPTIMAL 

 int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
     for(int i:nums){
        if(i<=first) first=i;
        else if(i<=second) second=i;
        else return true;
     }
return false;
     }
}