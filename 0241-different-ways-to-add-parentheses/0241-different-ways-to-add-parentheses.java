class Solution {
    int evaluate(int a, int b, char op) {
        switch(op) {
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
        }
        return 0;
    }
    List<Integer> solve(String s, int i, int j) {
        List<Integer> res = new ArrayList<>();
        if(j - i <= 1) {
            res.add(Integer.parseInt(s.substring(i, j + 1)));
            return res;
        } 
        for(int k = i; k < j; k++) {
            char op = s.charAt(k);
            if(op == '+' || op == '-' || op == '*') {
                List<Integer> left = solve(s, i, k-1);
                List<Integer> right = solve(s, k+1, j);
                for(int l: left) {
                    for(int r: right) {
                        int ans = evaluate(l,r,op);
                        res.add(ans);
                    }
                }
            }
        }
        return res;
    }
    public List<Integer> diffWaysToCompute(String expression) {
        int n = expression.length();
        return solve(expression, 0, n-1);
    }
}