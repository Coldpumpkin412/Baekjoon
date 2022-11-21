class Solution {
    public int solution(int n) {
        int answer = 0; //합을 저장할 변수
        int rest;
        int division=1; //몫
        
        while(n != 0){
            rest = n % 10;
            n /= 10;
            
            answer += rest;
        }
        
        
        return answer;
    }
}