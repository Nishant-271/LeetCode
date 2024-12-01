class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            float target = (float) arr[i] / 2;
            int x = Search(arr, target);
            if(x != i & x != -1){
                return true;
            }
        }
        return false;
    }
    static int Search(int[] arr, float target){
        for(int i = 0; i < arr.length; i++){
            if((float) arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}