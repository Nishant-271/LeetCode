class Solution {
    public int pivotIndex(int[] nums) {
        // This question is also known as to find 
        // the equilibrium index in the array 

        int total=0,curr=0;
        for(int i:nums) total+=i;
        for(int i=0;i<nums.length;i++){
            if(curr==total-curr-nums[i]) return i;
         curr+=nums[i];
        }
return -1;

    }
}