class Solution {
    public int[] twoSum(int[] nums, int target) {
/*    BRUTE FORCE ::
      
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(i==j) continue;
//                 if(nums[i]+nums[j]==target) return new int[]{i,j};
//             }
//         }

// return new int[]{0};  */
 
//    By using HASHMAP :: better approch ::
 HashMap<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<nums.length;i++){
    int num=nums[i];
    int rem=target-nums[i];
    if(map.containsKey(rem)){
        return new int[]{i,map.get(rem)};
    }
    map.put(num,i);
  }
 
 return new int[]{0};
    }

}