class Solution {
    public int smallestNumber(int n) {
        String val=Integer.toBinaryString(n);
        StringBuilder ans=new StringBuilder();
                 for(int i=0;i<val.length();i++){
                    if(val.charAt(i)=='0'){
                        ans.append('1');
                    }
                    else{
                        ans.append(val.charAt(i));
                    }
                 }

                 int result=Integer.parseInt(ans.toString(),2);
        return result;
    }
}