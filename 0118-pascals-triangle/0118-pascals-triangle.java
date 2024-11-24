class Solution {
    public List<List<Integer>> generate(int numRows) {
    //    we will try to solve this question in n square 
List<List<Integer>> ans=new ArrayList<>();
  for(int i=1;i<=numRows;i++){
    ans.add(func(i));
  }

return ans;


    }
public static List<Integer> func(int n){
    int res=1; 
    List<Integer> temp=new ArrayList<>();
      temp.add(res);

      for(int i=1;i<n;i++){
        res=res*(n-i);
        res=res/i;
        temp.add(res);
      }
return temp;
}


}