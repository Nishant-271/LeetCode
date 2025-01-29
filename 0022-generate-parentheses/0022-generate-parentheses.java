class Solution {
public List<String> generateParenthesis(int n) {
 List<String> result=new ArrayList<>();
 gen("(",1,0,n,result);
 return result;


}

 public static void gen(String ans,int open,int close,int n,List<String> result){
    if(open==n && close==n){
        result.add(ans);
        return;
    }
 if(open<n){
    gen(ans+"(",open+1,close,n,result);
 }
 if(close<open){
    gen(ans+")",open,close+1,n,result);
 }
 }

}