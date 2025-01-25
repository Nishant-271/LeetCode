class Solution {
    public int maxPower(String s) {
char ch=s.charAt(0);
    int max=1;
    int count=1;
    for(int i=1;i<s.length();i++){
        char c=s.charAt(i);
        if(c==ch){
            count++;
        }
        else{
        max=Math.max(max,count);
            ch=c;

            count=1;
        }
    }
        max=Math.max(max,count);

return max;
    }
}