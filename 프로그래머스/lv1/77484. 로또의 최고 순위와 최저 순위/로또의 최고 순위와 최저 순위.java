public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] win = {6, 6, 5, 4, 3, 2, 1};
        int maxCnt = 0; //최대 등수
        int lowCnt = 0; //최소 등수

        int[] answer = new int[2]; //최소 및 최대 등수

        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) maxCnt++; //0의 개수만큼 등수가 올라감
            
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) { //점수가 같으면
                    maxCnt++; //최대등수 상승
                    lowCnt++; //최소등수 상승
                }
            }
        }

        answer[0] = win[maxCnt];
        answer[1] = win[lowCnt];

        return answer;
    }
}