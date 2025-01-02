class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int arr[]:matches){
        int v=arr[1];
        map.put(v,map.getOrDefault(v,0)+1);
 }

    for(int arr[]:matches){
        int u=arr[0]; 
        int v=arr[1];
        if(!map.containsKey(u)){
            temp1.add(u);
            map.put(u,2);
        }
        if(map.get(v)==1){
            temp2.add(v);
        }
    }

Collections.sort(temp1);
Collections.sort(temp2);
ans.add(temp1);
ans.add(temp2);

    return ans;
    }

}