import java.util.*;

class Solution {
    public int solution(int n) {
        //소수 판별은 약수 판별이라고 할 수도 있다.
		//소수 : 약수의 개수가 2개(1과 자기자신)인 수
		//소수판별시 제곱근까지만 확인하면된다
        int answer = 0;
        
        for(int i=2 ; i<=n ; i++){
            if(PrimeNumber(i)) answer++;
        }
        return answer;
    }
    
    public boolean PrimeNumber(int num){
        int end = (int)Math.sqrt(num);
        
        for(int i=2 ; i<=end ; i++){
            if(num%i==0) return false;
        }
        
        return true;
    }
}