class Solution {
    public boolean check(int[] nums) {
        return checked(nums);
    }
    public static boolean checked(int []a){
        int b[]=a.clone();
        Arrays.sort(b);
            for(int x=0;x<a.length;x++){
                boolean flag=true;
                for(int i=0;i<a.length;i++){
                    if(a[(x+i)%a.length]!=b[i]){
                        flag=false;
                        break;
                    }

                }
                if(flag==true){
                    return true;
                }
            }
return false;
    }
}