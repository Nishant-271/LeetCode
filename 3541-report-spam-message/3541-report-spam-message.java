class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        HashSet<String> st=new HashSet<>();
        for(String s : bannedWords){
            st.add(s);
        }
        
        for(int i=0;i<message.length;i++){
            if(st.contains(message[i])){
                count++;
            }
        }
        
        return (count>=2);
        
    }
}