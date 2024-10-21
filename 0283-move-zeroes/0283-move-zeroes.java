class Solution {
    public void moveZeroes(int[] nums) {
        // ONE METHOD ::
        // int index=0;
        // for(int num:nums){
        //     if(num!=0){
        //         nums[index++]=num;
        //     }
        // }

        // while(index<nums.length){
        //     nums[index++]=0;
        // }
    
    // TWO SWAP METHOD J KO FIRST ZERO PR POHOCHAU AND THEN AGAR NEXT 
    // ELEMENT ZERO NHI HAI TOH USSE SWAP KRTE JAO 
     
     int j=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
     }
     if(j==-1) return;

   for(int i=j+1;i<nums.length;i++){
    if(nums[i]!=0){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j++;
    }
   }


    }
}