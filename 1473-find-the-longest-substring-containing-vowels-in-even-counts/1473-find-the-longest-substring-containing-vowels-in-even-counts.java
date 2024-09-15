class Solution {
    public int findTheLongestSubstring(String s) {
       int max = 0;
      
        for(int j=0;j<s.length()-max;j++){
              
        int xor =0;
        for(int i =j;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
                xor = xor ^((s.charAt(i)-'a') + 1);

            }else{
                xor = xor ^0;
            }

            if(xor==0){
                max = Math.max(i-j+1,max);
            }

        }
        }
        return max;
        
    }
}