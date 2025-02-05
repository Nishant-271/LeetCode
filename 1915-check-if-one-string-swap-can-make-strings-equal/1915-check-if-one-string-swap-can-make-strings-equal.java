class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int mismatch=0;
          int arr[]=new int[2];
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
         if(c1!=c2){
               mismatch++;
            if(mismatch==1){
            arr[0]=i;
            }
            if(mismatch==2){
                arr[1]=i;
            }
         } 
         if(mismatch>2){
            return false;
         }


        }
System.out.print(Arrays.toString(arr));
 if(s1.charAt(arr[0])==s2.charAt(arr[1]) && s2.charAt(arr[0])==s1.charAt(arr[1])){
    return true;
 } 


return false;


    }
}