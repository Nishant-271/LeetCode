class Solution {
    public void nextPermutation(int[] nums) {
     
     /* BRUTE FORCE   : ME mujhe sare permutations nikalne pdenge  
     if n=5 toh total permutation 5!=120 yani 120 permutation 
     nikalne bahut jyada timme taking hai 
toh hm brute force ko krenge nhi 
*/

//   OPTIMAL SOLUTION INCLUDE THREE STEPS ::
// first step : hm breakpoint dhundenge 
int n=nums.length; int index=-1;
for(int i=n-2;i>=0;i--){
   if(nums[i]<nums[i+1]){
    index=i;
    break;
   }
}
//  if index==-1 yani koi greater nhi hai next toh main array ko direct reverse krke bhej dunga 
if(index==-1){
reverse(0,n-1,nums);
return;
}

//  second step : jo bhi ith index vale se just greter hai usse swap kr dena 
for(int i=n-1;i>index;i--){
    if(nums[index]<nums[i]){
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
        break;
    }
}

// third step : jo bhi elements abb bache hai unko reverse kr denge 
reverse(index+1,n-1,nums);
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