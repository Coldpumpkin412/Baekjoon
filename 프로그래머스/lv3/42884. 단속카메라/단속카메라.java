import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        //그리디 알고리즘 활용하기
        
        int answer = 0;
        
        //도착시간 기준 오름차순 정렬
		Arrays.sort(routes, (a,b)-> Integer.compare(a[1], b[1]));
		
		//도착시간 초기값
		int min = Integer.MIN_VALUE;
        
		for(int[] route : routes) {
            //도착시간보다 다음 시작 시간이 큰 경우
			if(min<route[0] ) {
				//겹치지 않는다면 카메라 대수 추가 후 도착시간 갱신
				min = route[1];
				answer++;
			}
		}
        return answer;
    }
}