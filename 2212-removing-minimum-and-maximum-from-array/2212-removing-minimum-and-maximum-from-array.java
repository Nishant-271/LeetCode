class Solution {
    public int minimumDeletions(int[] nums) {
         //  removing the both min and max elements from the start and from the end
      int min=nums[0],max=nums[0];
      int min_index=0,max_index=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
            min_index=i;
        }
       
        if(nums[i]>max){
            max=nums[i];
            max_index=i;
        } 
         }

    int front=Math.max(min_index,max_index)+1;
    int back=nums.length-Math.min(min_index,max_index);
 int mid=Math.min(min_index+1+(nums.length-max_index),max_index+1+(nums.length-min_index));

  return Math.min(front,Math.min(back,mid));
    }
}