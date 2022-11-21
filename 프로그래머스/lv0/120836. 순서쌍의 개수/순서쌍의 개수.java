class Solution {
    public int solution(int n) {
        //사실상 약수의 개수를 구하는 문제
        int answer = 0;
        
        for(int i=1 ; i<=n ; i++){
            if(n%i == 0) answer ++;
        }
        return answer;
    }
}