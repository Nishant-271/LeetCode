class Solution {
    public String frequencySort(String s) {
        // BRUTE FORCE 
      Map<Character,Integer> map=new HashMap<>();
      for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }

      StringBuilder ans=new StringBuilder();
      for(int count=s.length();count>0;count--){
        for(char j:map.keySet()){
            if(map.get(j)==count){
                ans.append(String.valueOf(j).repeat(count));
            }
        }
      }
return ans.toString();
    }
}