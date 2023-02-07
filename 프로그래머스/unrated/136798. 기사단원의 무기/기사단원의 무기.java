import java.util.*;

class Solution {
    //약수의 개수를 정하는 함수
    //제곱근이 정수면 약수의 개수는 홀수개
    //제곱근이 정수가 아니면 약수의 개수는 짝수개
    public static int count(int a){
        int cnt=0;
        
        for(int i=1 ; i<=Math.sqrt(a) ; i++){
            if(a%i==0) {
                if(a/i==i) cnt++; //제곱근이 정수라면 하나만 올려줘야함
                else cnt += 2; //가운데 숫자까지만 구하고 두배를 해줘야하기때문
            }
        }
        
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1 ; i<=number ; i++){
            if(count(i)<=limit) answer+=count(i);
            else answer += power;
        }
        return answer;
    }
    
}