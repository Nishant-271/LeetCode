class Solution {
    public boolean canAliceWin(int n) {
        
        if(n < 10){
            return false;
        }
        
        n -= 10;
        int temp = 9; // bob takes odd amount out from n
        
        
        while(n >= temp){
            n -= temp;
            temp--;
        }
        
        return temp % 2 == 0 ? false : true;
    }
}