class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    //    FIRST APPROCH ::::::::::
 HashMap<Integer,Integer> map=new HashMap<>();
 for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
HashSet<Integer> st=new HashSet<>(map.values());
return st.size()==map.size();
    }
}