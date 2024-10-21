class Solution {
    public void sortColors(int[] nums) {
        // BY BUILT IN METHOD ::
        // Arrays.sort(nums);

//  BYUSING TWO FOR LOOPS SWAPPING 
// for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//         if(nums[i]>nums[j]){
//             int temp=nums[i];
//             nums[i]=nums[j];
//             nums[j]=temp;
//         }
//     }
// }

//  BY USING DUTCH NATIONAL FLAG ALGORITHM ::
int mid=0,low=0,high=nums.length-1;
while(mid<=high){
    if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        mid++;
        low++;
    }
    else if(nums[mid]==1) mid++;
    else{
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
    }
}


    }
}