class Solution {
    public int subarraySum(int[] nums, int k) {
        // BRUTE FORCE 

//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum==k) count++;
//             }
//         }

// return count;
   
   
//    OPTIMAL SOLUTION :::
  HashMap<Integer,Integer> map=new HashMap<>();
  int prefixsum=0; int count=0;
  map.put(0,1);
  for(int i=0;i<nums.length;i++){
   prefixsum+=nums[i];
   int remove=prefixsum-k;
   if(map.containsKey(remove)){
    count+=map.get(remove);
   }
   
     map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

  }

return count;
   
   
    }
}