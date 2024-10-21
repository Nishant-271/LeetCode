class Solution {
    public void rotate(int[] nums, int k) {
        // BY MAKING A NEW ARRAY ::
        // k=k%nums.length;
        // int rot[]=new int[nums.length];
        //   for(int i=0;i<nums.length;i++){
        //     rot[(i+k)%nums.length]=nums[i];
        //   }

        //   for(int i=0;i<nums.length;i++){
        //     nums[i]=rot[i];
        //   }


        // By making a temporary array 
//         k=k%nums.length;
//         int temp[]=new int[k];
//        for(int i=0;i<k;i++){
//             temp[i]=nums[nums.length-k+i];
//         }
//  for(int i=nums.length-1;i>=k;i--){
//     nums[i]=nums[i-k];
//  }
//  for(int i=0;i<k;i++){
//     nums[i]=temp[i];
//  }


//  OPTIMAL SOLUTION THREE REVERSE TECHNIQUE ::
  k=k%nums.length;
  reverse(0,nums.length-1,nums);
  reverse(0,k-1,nums);
  reverse(k,nums.length-1,nums);
}

 public static void reverse(int start,int end,int nums[]){
      
       while(start<=end){
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++; end--;
       }   


 }   

}