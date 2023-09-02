import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
	//색종이 맵 선언
	public static int[][] map = new int[10][10];
	
	//색종이 종류별 개수(각 5장) 선언(0은 제외)
	public static int[] paper = {0,5,5,5,5,5};
	
	//정답변수 초기값 선언
	public static int answer = Integer.MAX_VALUE;
	
	
	//DFS함수
	public static void DFS(int row, int col, int count) {
		//맵에 맨 끝에 도달한 경우
		if(row>=9 && col>9) {
			//answer와 count 비교한 후 더 작은 값을 반환 및 종료
			answer = Math.min(answer, count);
			return;
		}
		
		//answer보다 count가 커지면 더이상 의미 없으므로 종료
		if(answer <= count) {
			return;
		}
		
		//열에 끝부분에 도달한 경우 다음행으로 이동(재귀적 호출)
		if(col > 9) {
			DFS(row+1, 0, count);
			return;
		}
		
		//맵에 값이 1인경우(색종이를 붙여야하는 경우)
		if(map[row][col] == 1) {
			//색종이의 최소개수를 구해야하기때문에 5x5색종이 부터 탐색한다
			for(int i=5 ; i>=1 ; i--) {
				//붙여야할 색종이의 개수가 남아있고 붙일 수 있는 자리라면
				if(paper[i]>0 && checkAttach(row, col, i)) {
					//색종이 붙인 후(1→0) 색종이 개수 하나 줄이기
					Attach(row, col, i, 0);
					paper[i]--;
					
					//다음 열로 이동 후 DFS재귀적 호출(이 때 사용한 색종이 개수는 하나 늘어나있음)
					DFS(row, col+1, count+1);
					
					//재귀호출이 모두 끝나면 색종이를 다시 떼기(0→1) 이 후 색종이 개수 다시 증가
					Attach(row, col, i, 1);
					paper[i]++;
				}
			}
		}else {//map의 값이 1이 아니라면 옆칸으로 이동
			DFS(row, col+1, count);
		}
	}
	
	//색종이를 붙이거나 떼는 함수(행, 열, 색종이크기, 붙임상태(0 or 1))
	public static void Attach(int row, int col, int length, int state) {
		for(int i=row ; i<row+length ; i++) {
			for(int j=col ; j<col+length ; j++) {
				//state가 0이라면 색종이를 붙인경우, 1이라면 떼는 경우
				map[i][j] = state;
			}
		}
	}
	
	//색종이를 붙일 수 있는지 확인하는 함수(행, 열, 색종이크기)
	public static boolean checkAttach(int row, int col, int length) {
		for(int i=row ; i<row+length ; i++) {
			for(int j=col ; j<col+length ; j++) {
				//맵에 벗어나거나 1이 아닌경우 불가
				if(i<0 || i>=10 || j<0 || j>= 10 || map[i][j]!=1) {
					return false;
				}
			}
		}
		
		return true;
	}
	
    public static void main(String[] args) throws IOException{
    	/* 
    	 * 백트래킹(DFS + 가지치기) 활용하여 풀기
    	 * 제약조건 : 같은 행, 같은 열, 대각선에 있는 경우는 제외
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//10x10 맵 값 입력
    	for(int i=0 ; i<10 ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<10 ; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	//DFS함수 실행
    	DFS(0, 0, 0);
    	
    	//정답변수가 초기 선언(MAX_VALUE) 그대로라면 -1로 변환
    	if(answer == Integer.MAX_VALUE) {
    		answer = -1;
    	}
    	
    	System.out.println(answer);
    	
    }
}	
