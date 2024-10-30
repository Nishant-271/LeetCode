class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> left = new HashMap<>();
         HashMap<Integer,Integer> right = new HashMap<>();
         for(int i=0;i<n;i++){
            left.put(i,1);
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    left.put(i,Math.max(left.get(i),left.get(j)+1)) ;
                }
            }
         }
          for(int i=n-1;i>=0;i--){
            right.put(i,1);
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j]){
                    right.put(i,Math.max(right.get(i),right.get(j)+1)) ;
                }
            }
         }
         int min = Integer.MAX_VALUE;
         for(int i=1;i<n;i++){
            if(left.get(i)>1&&right.get(i)>1){
               int mlength = left.get(i)+right.get(i) -1;
               min = Math.min(min,n-mlength);
            }
         }
return min;
    }
}