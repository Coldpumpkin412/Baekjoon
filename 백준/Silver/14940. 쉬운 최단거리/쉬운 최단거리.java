import java.util.*;
import java.io.*;

class Point{ //좌표로 활용할 포인트 클래스
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	
	//목표지점까지의 거리를 저장할 정답배열
	static int[][] distance;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS에 활용할 큐
	static Queue<Point> queue = new LinkedList<>();

	//BFS 활용
	static void BFS(int row, int col) {
		//초기값 넣기 및 방문처리
		queue.add(new Point(row, col));
		visited[row][col] = true;
		
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			
			for(int i=0 ; i<4 ; i++) {
				int next_row = now.x + dx[i];
				int next_col = now.y + dy[i];
				
				//다음 노드가 0이거나 방문한적이 있거나 맵을 벗어나면 이동 불가
				if(next_row<0 || next_row>=N || next_col<0 || next_col>=M || 
				   map[next_row][next_col]==0 || visited[next_row][next_col]) {
					continue;
				}
				
				//큐에 다음 값 넣어주기 및 방문처리
				queue.add(new Point(next_row, next_col));
				visited[next_row][next_col] = true;
				
				//거리 저장
				distance[next_row][next_col] = distance[now.x][now.y] + 1;
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//지도의 크기 N(세로)과 M(가로)
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//지도 및 방문처리 배열 선언
		map = new int[N][M];
		distance = new int[N][M];
		visited = new boolean[N][M];
		
		int start_row = 0;
		int start_col = 0;
		
		//맵 상태 입력
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<M ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				//2가 입력는 곳이 출발지점
				if(map[i][j] == 2) {
					start_row = i;
					start_col = j;
				}
			}
		}
		
		//BFS함수 실행
		BFS(start_row, start_col);
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				//방문 가능하면서 방문하지 못한 땅
				if(map[i][j]==1 && !visited[i][j]) {
					sb.append("-1").append(" ");
				}else {
					sb.append(distance[i][j]).append(" ");	
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}	
