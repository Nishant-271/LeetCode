class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
     int j=0;
     for(char ch:map.keySet()){
        int val=map.get(ch);
        if(val<3){
            j=j+map.get(ch);
         }
      else{
        if(map.get(ch)%2!=0){
            j=j+1;
        }else{
            j=j+2;
        }
      }
     }
return j;
    }
} 