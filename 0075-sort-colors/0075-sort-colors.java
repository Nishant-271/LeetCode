class Solution {
    public void sortColors(int[] nums) {
    // BY BUILT IN METHOD ::
        // Arrays.sort(nums);
    
    // BY JUST SWAPING USING TWO FOR LOOPS ::
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
   
//    BY O(N)
 int count0=0;
 int count1=0;
 int count2=0;
   for(int i:nums){
    if(i==0) count0++;
    else if(i==1) count1++;
    else count2++;
   }
   
   for(int i=0;i<count0;i++){
    nums[i]=0;
   }
   
   for(int i=count0;i<count0+count1;i++){
    nums[i]=1;
   }

   for(int i=count0+count1;i<nums.length;i++){
    nums[i]=2;
   }

   



   
    }
}