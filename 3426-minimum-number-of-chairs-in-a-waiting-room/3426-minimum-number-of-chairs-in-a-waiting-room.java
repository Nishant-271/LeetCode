class Solution {
    public int minimumChairs(String s) {
        int max=0;        
        int curr=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
             curr++;
            }
            if(ch=='L'){
             curr--;
            }
             max=Math.max(curr,max);
        }
        return max;
    }
}