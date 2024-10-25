class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] ans = new int[nums.length - k + 1];
        for(int i=0;i<ans.length;i++){
            ans[i] = recursion(i,i+k-1,nums,x);
        }
        // System.out.println("findsum");
        return ans;
    }
    public int recursion(int start,int end,int[] nums,int x){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = nums.clone();
        for(int i=start;i<=end;i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        // System.out.println("21");
        int st = start;
        int ed = end;
        while(st!=(ed+1)){
            if(st==0){
                st++;
                continue;
            }
            // System.out.println("26");
            int num = arr[st];
            int i = st;
            int j = st -1;
            while(j>=start && (map.get(arr[i])>map.get(arr[j]) || (map.get(arr[i]) == map.get(arr[j]) && arr[i]>arr[j] ) ) ){
                // System.out.println("33");
                swap(i,j,arr);
                i--;
                j--;
            }
            st++;
        }
        // System.out.println(Arrays.toString(arr));
        // int mark = 0;
        // if(map.size()<x){
        //     mark = arr.length;
        // }
        int x_sum = 0;
        int count = 0;
        for(int i=start;i< arr.length && count<x && i<=end;i++){
            x_sum += arr[i];
            if(i!=arr.length-1 && arr[i]!=arr[i+1]){
                count++;
            } 
        }
        return x_sum;
    }
    public void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}