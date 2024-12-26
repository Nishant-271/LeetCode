class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

// BRUTE FORCE :::

//         Set<List<Integer>> set=new HashSet<>();
//  Arrays.sort(nums);
//  for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//        for(int c=j+1;c<nums.length;c++){
//         if(nums[i]+nums[j]+nums[c]==0){
//             List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[c]);
//             // temp.sort(null);
//             set.add(temp);
//         }
//        }

//     }
//  }

  
//         List<List<Integer>> result=new ArrayList<>(set);
//  return result;

//   BETTER APPROCH ::

 HashSet<List<Integer>> st=new HashSet<>();
 for(int i=0;i<nums.length;i++){
    HashSet<Integer> s2=new HashSet<>();
    for(int j=i+1;j<nums.length;j++){
        int val=-(nums[i]+nums[j]);
        if(s2.contains(val)){
            List<Integer> temp=Arrays.asList(nums[i],nums[j],val);
            temp.sort(null);
            st.add(temp);
        }
        s2.add(nums[j]);
    }
 }
 
List<List<Integer>> res=new ArrayList<>(st);
return res;



        // OPTIMAL ONE ::

//      List<List<Integer>> res=new ArrayList<>();
//      int n=nums.length;
//      if(n<3) return res;
//      Arrays.sort(nums);
//      for(int i=0;i<nums.length;i++){
//         if(i>0 && nums[i]==nums[i-1]) continue;
//         int j=i+1,k=n-1;
//         while(j<k){
//             int sum=nums[i]+nums[j]+nums[k];
//          if(sum<0){
//              j++;  
//          }else if(sum>0){
//               k--;  
//          }else{
//          List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
//          res.add(temp);
//          j++;
//          k--;
//          while(j<k && nums[j]==nums[j-1]){j++;}
//          while(j<k && nums[k]==nums[k+1]){k--;}
//          }

//         }
//      }







// return res;


 }

}