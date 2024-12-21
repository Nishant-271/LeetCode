class Solution {
    public int beautySum(String s) {
       
       int ans=0;
       for(int i=0;i<s.length();i++){
        int count[]=new int[26];
        for(int j=i;j<s.length();j++){
          int min=Integer.MAX_VALUE; int max=Integer.MIN_VALUE;
           count[s.charAt(j)-'a']++;  
         for(int x:count){
             if(x!=0){
                min=Math.min(min,x);
                max=Math.max(max,x);
             }
         }
        ans+=max-min;
        }
       }
return ans;
    }
}