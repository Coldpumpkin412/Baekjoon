import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
	//체스판의 row를 뜻하는 배열 및 크기 N
	public static int[] map;
	public static int N;
	
	//가능한 경우의 수
	public static int answer = 0;
	
	//퀸을 놓을 수 있는 지 확인하는 함수
	public static boolean check(int[] map, int col) {
		for(int i=1 ; i<col ; i++) {
			//같은 열인 경우 퀸 배치 불가
			if(map[i] == map[col]) {
				return false;
			}
			
			//서로 대각선에 있는경우(기울기 활용) 퀸 배치 불가
			if(Math.abs(i-col) == Math.abs(map[i]-map[col])) {
				return false;
			}
		}
		
		return true;
	}
	
	//DFS함수
	public static void DFS(int[] map, int col) {
		//마지막 행까지(N) 도달하면 경우의 수를 하나 증가해준다
		if(col == N) {
			answer++;
		}else {
			for(int i=1 ; i<N+1 ; i++) {
				//다음 행에 퀸을 놓아주기
				map[col+1] = i;
				
				//다음 행의 i열에 퀸을 배치할 수 있는경우
				if(check(map, col+1)) {
					//재귀적으로 다음 레벨에 대해 DFS 실행
					DFS(map, col+1);
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException{
    	/* 백트래킹,DFS 활용하여 풀기
    	 * 제약조건 : 같은 행, 같은 열, 대각선에 있는 경우는 제외
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//체스판의 크기 N 입력
    	N = Integer.parseInt(br.readLine());
    	
        //1행부터 N행까지
    	for(int i=1 ; i<N+1 ; i++) {
    		//0행을 무시하기 위해 하나 더 크게 선언
    		map = new int[N+1];
    		
    		//1행 1열에 퀸 놓기
    		map[1] = i;
    		
    		//DFS함수 실행, 두 번째 인덱스는 column을 뜻함
    		DFS(map, 1);
    	}
    	
    	System.out.println(answer);
    }
}	
