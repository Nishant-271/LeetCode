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
 for(int i:nums) st.add(i);
return (st.size()==nums.length)?false:true;
    }
}