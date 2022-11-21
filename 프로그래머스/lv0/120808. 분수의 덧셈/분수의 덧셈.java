import java.util.*;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int gcd=1; //최대공약수 저장
        
        answer[0] = denum1*num2 + denum2*num1; //분자
        answer[1] = num1 * num2; //분모
        
        for(int i=1 ; i<=answer[0] && i<=answer[1] ; i++){
            if(answer[0]%i==0 && answer[1]%i==0) gcd = i;
        }
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
}