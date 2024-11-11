class Solution {
    public String largestOddNumber(String s) {
    //      int maxodd=0; String ans="";
    //   for(int i=0;i<s.length();i++){
    //     int val=Character.getNumericValue(s.charAt(i)); 
    //     if(val%2!=0){
    //          maxodd=Math.max(maxodd,val); 
    //     }
    //   }
    //   ans+=maxodd;
    //   return ans;
    
    for(int i=s.length()-1;i>=0;i--){
     int n=Character.getNumericValue(s.charAt(i));
     if(n%2!=0){
        return s.substring(0,i+1);
     }
    }
    
    return "";
    }
}