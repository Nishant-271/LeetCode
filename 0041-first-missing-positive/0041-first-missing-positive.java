class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        // Arrays.sort(nums);
        // int start=nums[0];
        int start=1;  int n=nums.length;
        // int ans=1;
        for(int i:nums){
            set.add(i);
        }
        while(n--!=0){
            if(set.contains(start)){
                start++;
            }
            if(!set.contains(start)){
                return start;
            }
        } 
return -1;
    }
}