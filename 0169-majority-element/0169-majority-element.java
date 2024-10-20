class Solution {
    public int majorityElement(int[] nums) {
        // BRUTE FORCE
        // int val=nums.length/2;
        // for(int i=0;i<nums.length;i++){
        // int count=0;
        // for(int j=0;j<nums.length;j++){
        // if(nums[j]==nums[i]) count++;
        // }
        // if(count>val) return nums[i];
        // }
        // return 0;

        // BY USING HASHMAP :

        // HashMap<Integer,Integer> map=new HashMap<>();
        // int val=nums.length/2;
        // for(int i:nums){
        // map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        // if(entry.getValue()>val){
        // return entry.getKey();
        // }
        // }

        // return 0;

        // BY USING MOORE'S VOTING ALGORITHM :::
        int count=0;
        int el=0;
        int val=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(count==0) {
                el=nums[i];
                count=1;
            }
            else if(el==nums[i]){
              count++;
            }   
            else{
                count--;
            }
            
                 }
      int count1=0;
      for(int i=0;i<nums.length;i++){
         if(nums[i]==el){
            count1++;
         }
         if(count1>val){
            return nums[i];
         }
      }
return 0;
    }
}