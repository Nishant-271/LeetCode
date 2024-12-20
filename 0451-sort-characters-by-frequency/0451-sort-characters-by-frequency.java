class Solution {
   class pair{
    char ch; int freq;
    pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
   }

    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
    PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
    for(char j:map.keySet()){
        pq.offer(new pair(j,map.get(j)));
    }

    StringBuilder ans=new StringBuilder();
    while(!pq.isEmpty()){
        pair p=pq.remove();
        char c=p.ch;
        int count=p.freq;
      ans.append(String.valueOf(c).repeat(count));
    }
  return ans.toString();
  }
}