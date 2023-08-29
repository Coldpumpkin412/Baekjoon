import java.util.*;

class Solution {
    public int solution(int sticker[]) {
        //다이나믹 프로그래밍 활용하여 풀기
       
        //스티커가 하나 뿐인 경우
        if (sticker.length == 1) {
            return sticker[0];
        }
        
        //다이나믹프로그래밍에 활용할 배열 2개 선언
        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];

        //첫번째 스티커를 떼는 경우
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i=2 ; i<sticker.length-1 ; i++) {
            dp1[i] = Math.max(dp1[i-1], dp1[i-2]+sticker[i]);
        }

        //두번째 스티커부터 떼는 경우
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i=2 ; i<sticker.length ; i++) {
            dp2[i] = Math.max(dp2[i-1], dp2[i-2]+sticker[i]);
        }
        
        //두가지 경우 중 더 큰 값이 정답
        return Math.max(dp1[sticker.length-2], dp2[sticker.length-1]);
    }
}