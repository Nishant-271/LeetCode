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

//  HashSet<List<Integer>> s1=new HashSet<>();
 
//  for(int i=0;i<nums.length;i++){
//  Set<Integer> s2=new HashSet<>();
//     for(int j=i+1;j<nums.length;j++){
//          int val=-(nums[i]+nums[j]);
//          if(s2.contains(val)){
//             List<Integer> temp=Arrays.asList(nums[i],nums[j],val);
//              temp.sort(null);
//             s1.add(temp);

//          }
//          s2.add(nums[j]);
//     }
//          System.out.print(s2);
//  }
  


//  List<List<Integer>> result=new ArrayList<>(s1);
// return result;





        // OPTIMAL ONE ::

         List<List<Integer>>  res = new ArrayList();
        int n = nums.length;
        if (n < 3) return res;
        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            if(i >0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k = n-1;
            while(j<k) {
                int s = nums[i]+nums[j]+nums[k];
                if(s < 0) j++;
                else if( s > 0) k--;
                else {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }

        }
        return res;










 }

}