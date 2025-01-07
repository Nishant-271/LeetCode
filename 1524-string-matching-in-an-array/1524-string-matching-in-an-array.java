class Solution {
    public List<String> stringMatching(String[] words) {
   HashSet<String> st=new HashSet<>();
    for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if( !words[j].equals(words[i]) &&   words[j].indexOf(words[i])!=-1){
                st.add(words[i]);
            }
        }
    }

        List<String> ans=new ArrayList<>(st);
  

        return ans;

    }
}