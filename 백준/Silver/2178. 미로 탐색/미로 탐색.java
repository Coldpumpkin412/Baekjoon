import java.util.*;
import java.io.*;

public class Main {
	//행,열
	static int N,M;
	//미로를 나타낼 맵
	static int[][] map;
	//방문처리용 배열
	static boolean[][] visited;
	
	//좌표이동에 활용될 변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void BFS(int row, int col) {
		//BFS함수에 활용될 큐 선언
		Queue<int[]> queue = new LinkedList<>();
		
		//처음 시작노드 방문처리 및 큐에 넣어주기
		visited[row][col] = true;
		queue.offer(new int[] {row,col});
		
		//큐가 빌때까지 반복
		while(!queue.isEmpty()) {
			//큐의 헤드 뽑기
			int[] now = queue.poll();
			
			int now_Row = now[0]; //현재 노드의 행
			int now_Col = now[1]; //현재 노드의 열
			
			//동서남북으로 이동
			for(int i=0 ; i<4 ; i++) {
				int next_Row = now_Row + dx[i];
				int next_Col = now_Col + dy[i];
				
				//맵 영역을 벗어난 경우 continue
				if(next_Row<0 || next_Col<0 || next_Row>=N || next_Col>=M) continue;
				//방문한적이 있거나 길이 아닌 곳('0'인경우) 방문시 continue
				if(visited[next_Row][next_Col] || map[next_Row][next_Col]==0) continue;
				
				//가능한 영역에 방문시 큐에 넣어주기
				queue.add(new int[] {next_Row,next_Col});
				
				//값 +1 해주기(이동거리 증가)
				map[next_Row][next_Col] = map[now_Row][now_Col] + 1;
				
				//방문처리
				visited[next_Row][next_Col] = true;
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 최단거리문제 (BFS)활용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//N(행),M(열) 입력
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//입력된 행과열(N,M)을 기준으로 맵 생성
		map = new int[N][M];
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
			for(int j=0 ; j<M ; j++) {
				//정수형으로 변경 후 맵 표현
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		//방문처리용 배열 선언
		visited = new boolean[N][M];
		
		//(0,0)을 기준으로 BFS함수 실행
		BFS(0,0);
		
		//결과출력
		System.out.println(map[N-1][M-1]);
	}
}

	
