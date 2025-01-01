class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==2) ll.add(i);
        }
return ll;
    }
}