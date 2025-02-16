class Solution {
    public boolean containsDuplicate(int[] nums) {
    // BRUTE FORCE ::
//  for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//         if(nums[i]==nums[j]) return true;
//     }
//  }
// return false;

// OPTIMAL ONE :

 Set<Integer> st=new HashSet<>();
 for(int i:nums){
    if(st.contains(i)) return true;
    st.add(i);
 }
 return false;
    }
}