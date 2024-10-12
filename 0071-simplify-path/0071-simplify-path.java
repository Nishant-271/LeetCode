class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();

        if(path.endsWith("/"))
            path = path.substring(0,path.length()-1);
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<arr.length;i++) {
            if(!arr[i].equals("") && !arr[i].equals(".")) {
                if(arr[i].equals("..")) {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                else {
                    stack.push(arr[i]);
                }
            }
        }
        for(String s:stack) {
            sb.append("/");
            sb.append(s);
        }
        if (stack.isEmpty())
            return "/";
        return sb.toString();
    }
}