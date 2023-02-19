import java.util.*;

class Solution {
    int solution(int[][] land) {
        //0번째 행이 아닌 1번째 행부터 확인하여 각각의 열을 선택했을 시에 최대값들 중 제일 큰 값을 선택
		for(int i=1 ; i<land.length ; i++) {
			//1행에서 0열을 선택했기때문에 0행에서는 0열을 선택할 수 없음(제외)
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			//1행에서 1열을 선택했기때문에 0행에서는 1열을 선택할 수 없음(제외)
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			//1행에서 2열을 선택했기때문에 0행에서는 2열을 선택할 수 없음(제외)
			land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
			//1행에서 3열을 선택했기때문에 0행에서는 3열을 선택할 수 없음(제외)
			land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
		}
		
		//최신화 된 2차원 배열 값중에서 최댓값 찾기
		int[] answer = land[land.length-1];
		Arrays.sort(answer);
		
		return answer[answer.length-1];
    }
}