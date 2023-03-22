import java.util.*;
import java.io.*;

public class Main {
	//토마토상자의 가로 및 세로길이
	static int N,M;
	//토마토상자 표현 배열
	static int[][] tomato;
	
	//좌표이동에 활용할 배열
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS에 활용될 큐 선언
	static Queue<int[]> queue = new LinkedList<>();
	
	//걸린일 수
	static int day = Integer.MIN_VALUE;
	
	//BFS함수
	public static void BFS() {
		while(!queue.isEmpty()) {
			//큐의 헤드값을 현재좌표로 넣어주기
			int[] now = queue.poll();
			int now_Row = now[0];
			int now_Col = now[1];
			
			//상하좌우 확인
			for(int i=0 ; i<4 ; i++) {
				//상하좌우 이동 후 좌표
				int next_Row = now_Row + dx[i];
				int next_Col = now_Col + dy[i];
				
				//토마토상자 영역을 벗어나는 경우
				if(next_Row<0 || next_Col<0 || next_Row>=N || next_Col>=M) continue;
				
				//덜익은 토마토(값이 '0')인 경우 이전 값에 +1
				if(tomato[next_Row][next_Col] == 0) {
					tomato[next_Row][next_Col] = tomato[now_Row][now_Col] + 1;
					
                    //이동한 좌표 큐에 넣어주기
					queue.offer(new int[] {next_Row, next_Col});
				}
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				//걸린일 수의 최댓값
				day = Math.max(day, tomato[i][j]);
			}
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		/*
		 * 익은 토마토 주변에 익지않은토마토가 익는데까지 하루가 걸린다. 즉 이전값의 +1이 된다.
		 * 익은 토마토의 값이 1이므로 값이 1인지점을 기점으로 BFS함수를 실행.
		 * 최종적으로 토마토상자 안의 최댓값-1이 걸리는 일 수가 된다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		//가로 및 세로길이 입력
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		//토마토상자 선언
		tomato = new int[N][M];
		
		//토마토상자의 초기 상태 입력
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<M ; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
				
				//1이 입력되었다면 큐에 넣어주기
				if(tomato[i][j]==1) {
					queue.offer(new int[] {i,j});
				}
			}
		}
		
		BFS();
		
		//아직 익지않은 토마토가 있다면 -1 출력
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(tomato[i][j]==0) {
					System.out.println("-1");
					return;
				}
			}
		}
		
		//토마토가 모두 익은상태(1)로 시작해서 걸린 일 수의 최댓값이 1이라면 0을 출력
		if(day == 1) {
			System.out.println("0");
		}else{ //그 이외의 경우
			System.out.println(day-1);
		}
		
	}
}

	
