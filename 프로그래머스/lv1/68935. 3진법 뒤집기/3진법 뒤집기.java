import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> ternary = new ArrayList<>(); 
        
        //3진법으로 표현
        while(n>=3){
            ternary.add(0,n%3);
            n /= 3;
        }
        ternary.add(0,n);
        
        for(int i=0 ; i<ternary.size() ; i++){
            answer += ternary.get(i).intValue() * Math.pow(3, i); //3의 제곱수 곱해주기
        }
        
        return answer;
    }
}