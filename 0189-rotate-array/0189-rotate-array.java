class Solution {
    public void rotate(int[] nums, int k) {
        // BRUTE FORCE ::::
// BY MAKING THE TEMPORARY ARRAY 
// k=k%nums.length;
// int temp[]=new int[k];
// for(int i=0;i<k;i++){
// temp[i]=nums[nums.length-k+i];
// }
//   for(int i=nums.length-1;i>=k;i--){
//         nums[i]=nums[i-k];
//     }
//   for(int i=0;i<k;i++){
//     nums[i]=temp[i];
//   }   
 k=k%nums.length;
 reverse(0,nums.length-1,nums);
 reverse(0,k-1,nums);
 reverse(k,nums.length-1,nums);



    }

public static void reverse(int start,int end,int nums[]){
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    start++;end--;
    }
}

}