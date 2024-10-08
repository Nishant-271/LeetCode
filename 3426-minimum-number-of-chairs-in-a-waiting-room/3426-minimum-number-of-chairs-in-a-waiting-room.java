class Solution {
    public int minimumChairs(String s) {
        int max=0;        
        int curr=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
             curr++;
             max=Math.max(curr,max);
            }
            else{
             curr--;
            }
        }
        return max;
    }
}