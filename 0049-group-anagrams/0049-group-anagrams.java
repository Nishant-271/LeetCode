class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //   List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();

        for(String str :strs){
            String key=findkey(str);
     if(map.containsKey(key)){
     map.get(key).add(str);
     }
     else{
        List<String> list=new ArrayList<>();
        list.add(str);
        map.put(key,list);
        }
    }
        // for(String k:map.keySet()){
        //     ans.add(map.get(k));
        
        // }
        
// return ans;
return new ArrayList<>(map.values());
    }
        public String findkey(String str){
            int [] arr=new int[26];
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                arr[ch-'a']=arr[ch-'a']+1;
            }

StringBuilder sb=new StringBuilder();
for(int a:arr){
    sb.append(a);
    sb.append(",");
}
return sb.toString();
        }
}