import java.util.*;
import java.math.*;

class Solution {
    //체스판의 row를 의미하는 map배열 선언
	public static int[] map;
    
	//정답변수
	public static int answer = 0;
	
	//체스판 크기(n과 같음)
	public static int N;
	
	//DFS함수
	public static void DFS(int[] map, int col) {
		//마지막 행에 도달한 경우 answer 증가
		if(col == N) {
			answer++;
		}else {
			for(int i=1 ; i<=N ; i++) {
				//다음 행에 퀸 놓기
				map[col+1] = i;
				
				//다음 행 i열에 퀸을 배치할 수 있는경우
				if(check(map, col+1)) {
					//재귀적으로 다음 레벨에 대한 DFS 실행
					DFS(map, col+1);
				}
			}
		}
		
	}
	
	//퀸을 놓을 수 있는지 확인하는 함수
	public static boolean check(int[] map, int col) {
		for(int i=1 ; i<col ; i++) {
			//같은 열이라면 퀸 배치 불가
			if(map[i] == map[col]) {
				return false;
			}
			
			//대각선에 있는 경우도 퀸 배치 불가(기울기 활용)
			if(Math.abs(i-col) == Math.abs(map[i]-map[col])) {
				return false;
			}
		}
		
		return true;
	}
    public int solution(int n) {
        //편의를 위해 전역변수로 선언한 N에 n넣어주기
        N = n;
		
		//0행은 제외, 1행부터 N행까지
		for(int i=1 ; i<=N ; i++) {
			//map 배열 선언(0행 무시를 위해 하나 더 크게)
			map = new int[N+1];
			
			//1행 1열에 퀸 놓기
			map[1] = i;
			
			//DFS함수 실행
			DFS(map, 1);
		}
		
		return answer;
    }
}