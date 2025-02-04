class Solution {
    public void nextPermutation(int[] nums) {
        // find the breakpoint
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        System.out.print(index);

if(index==-1){
    reverse(nums,0,n-1);
}

// replace the element with just greater one
else{for(int i=n-1;i>=index;i--){
    if(nums[index]<nums[i]){
int temp=nums[index];
nums[index]=nums[i];
nums[i]=temp;
break;

    }
}
reverse(nums,index+1,n-1);
}
    }
public static void reverse(int []nums,int start,int end){
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++; end--;
    }
} 



}