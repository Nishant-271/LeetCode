class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(nums.size()<2*k)
            return false;
        for(int i=0;i<=nums.size()-2*k;i++){
            if(increasing(nums,i,i+k-1)){
                if(increasing(nums,i+k,i+2*k-1))
                        return true;
            }
        }
        return false;
    }
    private boolean increasing(List<Integer> nums,int l,int r){
        for(int i=l;i<r;i++){
            if(nums.get(i)>=nums.get(i+1))
                return false;
        }
        return true;
    }
}