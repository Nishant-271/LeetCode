class Solution {
    public int punishmentNumber(int n) {
        int arr[] = {1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297, 369, 370, 379, 414, 657, 675, 703, 756, 792, 909,
            918, 945, 964, 990, 991, 999, 1000};
        int sum = 0;    
        for(int num : arr){
            if(num <= n){
                sum += num*num;
            }else{
                break;
            }
        }
        return sum;
    }
}    