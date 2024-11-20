class Solution {
    public double findMaxAverage(int[] nums, int k) {

// BRUTE FORCE :::

//         if(nums.length==1  && k==1){
//             return (double)nums[0];
//         }
//        double max=Integer.MIN_VALUE;

//        for(int i=0;i<nums.length;i++){
//         int length=0;double sum=0;
//         for(int j=i;j<nums.length;j++){
//               sum+=nums[j];
//               length++;
//               if(length==k){
//                 double res=sum/k;
//                 max=Math.max(max,res);
//               } 
//         }
//        }

// return max;


//  OPTIMAL SLIDING WINDOW THING 

int sum=0;
for(int i=0;i<k;i++){
 sum+=nums[i];
}
int maxsum=sum;
 int start=0;
 int end=k;

 while(end<nums.length){
    sum-=nums[start];
    start++;

    sum+=nums[end];
    end++;

    maxsum=Math.max(maxsum,sum);
 }



return (double)maxsum/k;

    }
}