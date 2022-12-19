import java.util.*;

class Solution {
    //약수의 개수를 정하는 함수
    public static int count(int a){
        int cnt=0;
        
        for(int i=1 ; i<=a ; i++){
            if(a%i==0) cnt++;
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