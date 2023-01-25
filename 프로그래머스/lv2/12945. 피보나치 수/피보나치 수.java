import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int first = 0;
        int second = 1;
        
        if(n == 1 || n == 0) return 1;
        
        for(int i = 2; i <= n; i++){
            answer = (first+second) % 1234567;
            first = second;
            second = answer;
        }
        
        return   answer;
    }

}