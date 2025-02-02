class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;
        for(char c: s.toCharArray()){
            if(c=='a' && foundB){
                return false;
            }
            if(c=='b'){
            foundB = true;
            }
        }
       
        return true;
    }
}