import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int num1 = (numer1 * denom2) + (numer2 * denom1); //분자
        int num2 = denom1 * denom2; //분모
        
        //기약분수로 만들기(분자, 분모 동시에 나누어지는 수가 있으면 나누어주기)
        for(int i = num1-1; i > 1; i--) {
            if(num1 % i == 0 && num2 % i == 0) { 
                num1 /= i;
                num2 /= i;
            }
        }
        answer[0] = num1;
        answer[1] = num2;
        
        return answer;
    }
}