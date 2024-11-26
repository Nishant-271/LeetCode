class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
    //  BRUTE FORCE :
//   List<Integer> ll=new ArrayList<>();
//     for(int i=0;i<nums.length;i++){
//       if(ll.size()==0 || ll.get(0)!=nums[i]){
//            int count=0;
//            for(int j=0;j<nums.length;j++){
//             if(nums[j]==nums[i]){
//                 count++;
//             }
//            }
//            if(count>nums.length/3){
//             ll.add(nums[i]);
//            }
//         if(ll.size()==2) break;
//       }
//     }

// return ll;






    //  BETTER APPROCH 
      List<Integer> arr=new ArrayList<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      int max=(int)nums.length/3+1;
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        if(map.get(i)==max){
            arr.add(i);
        }
        if(arr.size()==2) break;
      }
return arr;
    }
}