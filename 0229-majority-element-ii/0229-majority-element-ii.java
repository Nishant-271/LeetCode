class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> arr=new ArrayList<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
 for(int i:map.keySet()){
    if(map.get(i)>nums.length/3){
        arr.add(i);
    }
 }

return arr;
    }
}