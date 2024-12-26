class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  BRUTE FORCE ::  o(N*N)

//  for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//         if(nums[i]+nums[j]==target) return new int[]{i,j};
//     }
//  }

// return null;
   
   
//    OPTIMAL :: O(N)

HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    int rem=target-nums[i];
    if(map.containsKey(rem))return new int[]{i,map.get(rem)};
    map.put(nums[i],i);
}
   return null;
    }
}