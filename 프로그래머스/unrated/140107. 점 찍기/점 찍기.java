import java.util.*;

class Solution {
    public long solution(int k, int d) {
        /*
         * 원의 중심이 (0,0)이고 반지름이 d인 원 내부에 정수로 나타낼 수 있는 좌표의 개수
         * (1사분면에 존재하는 점만 인정 즉, 자연수들로 이루어진 좌표)
         */
        long answer = 0;
        
        for(int i=0 ; i<=d ; i+=k)  {
            //거리 구하기
            long distance_x = (long) d*d;
            long distance_y = (long) i*i;
            
            int Distance = (int) Math.sqrt(distance_x - distance_y);
            
            answer += (Distance/k)+1;
        }
        
        return answer;
    }
}