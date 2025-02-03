class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc[]=new int[nums.length];
        int dec[]=new int[nums.length];
        Arrays.fill(inc,1);
        Arrays.fill(dec,1);
          int max_inc=inc[0];   
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc[i]=inc[i-1]+1;
              max_inc=Math.max(inc[i],max_inc);
            }

        }
          int max_dec=dec[0];   
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                dec[i]=dec[i-1]+1;
              max_dec=Math.max(dec[i],max_dec);
            }

        }
    System.out.print(max_inc+" "+max_dec);

return Math.max(max_inc,max_dec);
    }
}