class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
    for(int i:nums) set.add(i);
   int start=1;
   int n=nums.length;
    while(n--!=0){
            if(set.contains(start)) start++;
            if(!set.contains(start)) return start;
    }
return -1;
    }
}