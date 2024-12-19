class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
              if(ch=='('){
                if(st.size()>0){
                    ans.append(ch);
                }
                st.push(ch);
              }
              else{
                st.pop();
                if(st.size()>0){
                    ans.append(ch);
                }
              }
        
        }
        return ans.toString();
    }
}