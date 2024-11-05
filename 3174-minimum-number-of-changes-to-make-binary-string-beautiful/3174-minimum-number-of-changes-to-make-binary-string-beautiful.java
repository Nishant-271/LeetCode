class Solution {
    public int minChanges(String s) {
    int count=0;
    
    for(int i=0;i<s.length();i+=2){
    String s2=s.substring(i,i+2);
     if(s2.equals("00") || s2.equals("11")) continue;
    else count++; 
    }
    return count;
    }
}