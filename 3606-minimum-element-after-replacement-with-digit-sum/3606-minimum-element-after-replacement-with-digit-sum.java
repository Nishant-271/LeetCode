class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            int no=nums[i];
            while(no!=0){
                int d=no%10;
                s=s+d;
                no=no/10;
            }
            nums[i]=s;
            s=0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}