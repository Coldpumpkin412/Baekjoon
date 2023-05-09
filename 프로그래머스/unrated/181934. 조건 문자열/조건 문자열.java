class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String compare = ineq + eq;
        
        if(compare.equals(">=")){
            return (n>=m) ? 1 : 0;
        }else if(compare.equals("<=")){
            return (n<=m) ? 1 : 0;
        }else if(compare.equals(">!")){
            return (n>m) ? 1 : 0;
        }else{
            return (n<m) ? 1 : 0;
        }
    }
}