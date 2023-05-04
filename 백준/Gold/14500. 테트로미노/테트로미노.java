import java.util.*;
import java.io.*;


public class Main {
	//테트로미노 경우의 수
	static int[][][] tetromino = { { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } },
								   { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 } }, 
								   { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } },
								   { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, 1 } }, 
								   { { 2, 0 }, { 2, 1 }, { 1, 1 }, { 0, 1 } },
								   { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 } }, 
								   { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 } },
								   { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 2, 0 } }, 
								   { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 2, 1 } },
								   { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 1, 2 } }, 
								   { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 2 } },
								   { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 1 } }, 
								   { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 2, 0 } },
								   { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 } }, 
								   { { 1, 0 }, { 1, 1 }, { 0, 1 }, { 0, 2 } },
								   { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 } }, 
								   { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 1 } },
								   { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 1, 1 } }, 
								   { { 1, 0 }, { 0, 1 }, { 1, 1 }, { 2, 1 } } };
	
	//테트로미노를 놓을 종이
	static int[][] map;
	
	//종이의 세로, 가로 크기
	static int N,M;
	
	//정답 선언 및 초기화
	static int answer = 0;
	
	public static void BFS(int row, int col) {
		//테트로미노 경우의 수 19개
		for(int i=0 ; i<19 ; i++) {
			//해당 경우에 따른 수들의 합
			int sum = 0;
			boolean check = true;
			
			for(int j=0 ; j<4 ; j++) {
				
				if(check) {
					//다음 칸의 좌표
					int next_Row = row + tetromino[i][j][0];
					int next_Col = col + tetromino[i][j][1];
					
					//범위 안에 있다면
					if(next_Row>=0 && next_Row<N && next_Col>=0 && next_Col<M) {
						//숫자 더해주기
						sum += map[next_Row][next_Col];
					}else {
						//범위를 벗어나는 경우 첫번째 반복문 벗어나기
						check = false;
					}
				}
			}
			
			//정답을 최댓값으로 갱신
			if(check) {
				answer = Math.max(answer, sum);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 도형들을 회전, 대칭하였을 때 나올 수 있는 모든 경우의 수(19개)를 좌표화 후 직접 비교
		 * 완전탐색과 BFS 활용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//세로, 가로 길이 입력
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//종이 정보 선언 및 값 입력
		map = new int[N][M];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<M ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//map의 첫 좌표부터 마지막좌표까지 완전탐색
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				BFS(i,j);
			}
		}
		
		
		System.out.println(answer);
	}
}	
