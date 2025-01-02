class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    //    FIRST APPROCH ::::::::::

//  HashMap<Integer,Integer> map=new HashMap<>();
//  for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
// HashSet<Integer> st=new HashSet<>(map.values());
// return st.size()==map.size();

   // SECOND APPROCH     :::::::::::::::::

int main[]=new int[2001];
for(int i:arr) main[i+1000]++;
Arrays.sort(main);
for(int i=1;i<2001;i++){
    if(main[i]!=0 && main[i]==main[i-1]) return false;
}

return true;
    }
}