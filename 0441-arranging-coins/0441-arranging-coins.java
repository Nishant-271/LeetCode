class Solution {
    public int arrangeCoins(int n) {
        int temp=0;
        int i=1;
       if(n==1) return 1;
        while(n>=0){
            temp++;
            n-=i;
            i++;
        }
    return temp-1;
    }
}