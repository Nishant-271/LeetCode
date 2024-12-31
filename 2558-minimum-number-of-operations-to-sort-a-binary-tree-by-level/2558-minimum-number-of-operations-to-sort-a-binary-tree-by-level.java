class Solution {
    public int minimumOperations(TreeNode root) {
    if(root==null) return 0;
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    int result=0;
    while(!q.isEmpty()){
        int size=q.size();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            TreeNode current=q.remove();
            int val=current.val;
            arr[i]=val;
            if(current.left!=null) q.add(current.left);
            if(current.right!=null) q.add(current.right);
        
        }
       result+=min_operation(arr);


    }

return result;
    }

    public static int min_operation(int arr[]){
        int swap=0;
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int sort_arr[]=Arrays.copyOf(arr,n);
        Arrays.sort(sort_arr);
     for(int i=0;i<n;i++){
        map.put(arr[i],i);
     }
    for(int i=0;i<n;i++){
        if(arr[i]==sort_arr[i]) continue;

        int truei=map.get(sort_arr[i]);
        map.put(arr[i],truei);
        map.put(sort_arr[i],i);
   int temp=arr[i];
   arr[i]=arr[truei];
   arr[truei]=temp;
   swap++;

    }
    return swap;
    }
}