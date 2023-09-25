import java.util.*;
import java.math.*;

class Solution {
    public int solution(int[][] targets) {
        //초기값 1로 설정
		int answer = 1;
		
		//targets 배열을 시작지점기준 오름차순 정렬
		Arrays.sort(targets, (o1,o2) -> (o1[0] - o2[0]));
		
		//초기시작지점(기준) 및 끝지점 설정
		int Start = targets[0][0];
		int End = targets[0][1];
		
		//정렬된 모든 미사일에 대해 탐색
		for(int[] target : targets) {
			//현재 시작점 및 끝지점
			int cur_Start = target[0];
			int cur_End = target[1];
			
			//현재 시작점이 이전 시작점과 이전 끝지점 사이인 경우
			if(Start<=cur_Start && cur_Start<End) {
				//기준 변경(시작점은 더 큰 값, 끝점은 더 작은값)
				Start = Math.max(Start, cur_Start);
				End = Math.min(End, cur_End);
			}else {//시작점이 기준지점 밖에있는경우 요격미사일이 하나 늘어남
				answer++;
				
				//기준 변경
				Start = cur_Start;
				End = cur_End;				
			}
		}
		
		return answer;
    }
}