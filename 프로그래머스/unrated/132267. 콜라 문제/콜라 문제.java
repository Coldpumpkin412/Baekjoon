class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; //받는 병의 개수
        
        while(n>=a){
            int rest = 0; //회차마다 나머지 병의 개수
            int get = 0; //회차마다 교환받는 병의 개수
            
            get = (n/a)*b;
            rest = n%a;
            answer += get;
            
            n=get+rest;
            
        }
        
        
        return answer;
    }
}