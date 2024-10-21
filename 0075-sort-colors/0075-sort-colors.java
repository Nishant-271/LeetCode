class Solution {
    public void sortColors(int[] nums) {
        // BY BUILT IN METHOD ::
        // Arrays.sort(nums);

//  BYUSING TWO FOR LOOPS SWAPPING 
for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
        if(nums[i]>nums[j]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}

    }
}