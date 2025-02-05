class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ll=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ll.add(i);
            }
        }

int ans[]=new int[ll.size()];
int j=0;
for(int i=0;i<ll.size();i++){
    ans[j++]=ll.get(i);
}
return ans;
    }
}