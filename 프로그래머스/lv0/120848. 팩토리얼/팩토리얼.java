class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac = 1;
        while(fac<=n){
            answer++;
            fac = fac*answer;
        }
        return answer-1;
    }
}