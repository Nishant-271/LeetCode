class Solution {
  class pair{
    char ch;
    int freq;
     pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
     }
  }


    public String frequencySort(String s) {
//  BRUTE FORCE ::
//  Map<Character,Integer> map=new HashMap<>();
//  for(char c:s.toCharArray()){
//     map.put(c,map.getOrDefault(c,0)+1);
//  }
  
//   StringBuilder ans=new StringBuilder();
//   for(int count=s.length();count>0;count--){
//     for(char j:map.keySet()){
//         if(map.get(j)==count){
//             ans.append(String.valueOf(j).repeat(count));
//         }
//     }
//   }
  
//   return ans.toString();
   
//    OPTIMAL : the above class is defined for optimal one 
    HashMap<Character,Integer> map=new HashMap<>();
    for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
 
 PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
 for(char i:map.keySet()){
    pq.offer(new pair(i,map.get(i)));
 }
 
 StringBuilder ans=new StringBuilder();
while(!pq.isEmpty()){
    pair p=pq.remove();
    char c=p.ch;
    int val=p.freq;
    ans.append(String.valueOf(c).repeat(val));
}

return ans.toString();

 
  }


}