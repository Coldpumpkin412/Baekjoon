import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        //n보다 s가 큰 경우 -1출력
        if(n > s) return new int[] {-1};
        
        int[] answer = new int[n];
        
        int index = 0;
        
        while(n > 0){
            int value = s/n;
            
            answer[index++] = value;
            s -= value;
            n--;
        }
        
        return answer;
    }
}