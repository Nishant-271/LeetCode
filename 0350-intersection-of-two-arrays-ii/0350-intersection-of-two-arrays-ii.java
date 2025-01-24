class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         
         for(int i:nums2){
            if(map.containsKey(i)){
                if(map.get(i)!=0){
                    arr.add(i);
                    map.put(i,map.get(i)-1);
                }
            }
         }


         int ans[]=new int[arr.size()];
         int j=0;
         for(int i:arr){
ans[j++]=i;
         }

return ans;
    }
}