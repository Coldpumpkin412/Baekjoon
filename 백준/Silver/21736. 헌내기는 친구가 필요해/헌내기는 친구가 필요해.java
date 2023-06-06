import java.util.*;
import java.io.*;

//좌표로 활용할 Point 클래스
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	//캠퍼스 크기
	static int N, M;
	//캠퍼스 및 방문처리 배열
	static String[] map;
	static boolean[][] visited;
	
	//도연이가 만난 사람의 수
	static int count = 0;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static void BFS(int row, int col) {
		Queue<Point> queue = new LinkedList<>();
		
		//초기값
		queue.offer(new Point(row, col));
		visited[row][col] = true;
		
		//큐가 빌때까지
		while(!queue.isEmpty()) {
			//현재노드
			Point now = queue.poll();
			
			for(int i=0 ; i<4 ; i++) {
				//다음노드
				int next_row = now.x + dx[i];
				int next_col = now.y + dy[i];
				
				//맵을 벗어나거나 'X'를 만나거나 방문한적이 있는경우
				if(next_row<0 || next_row>=N || next_col<0 || next_col>=M ||
				   map[next_row].charAt(next_col)=='X' || visited[next_row][next_col]) {
					continue;
				}
				
				//사람(P)를 만나면 count 증가
				if(map[next_row].charAt(next_col) == 'P') {
					count++;
				}
				
				//방문처리 후 큐에 넣기
				visited[next_row][next_col] = true;
				queue.offer(new Point(next_row, next_col));
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//캠퍼스 크기 입력 및 방문처리 배열 선언
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited = new boolean[N][M];
		
		//도연의 처음 위치 변수
		int start_row = 0;
		int start_col = 0;
		
		//캡퍼스 정보 입력
		map = new String[N];
		for(int i=0 ; i<N ; i++) {
			map[i] = br.readLine();
			
			for(int j=0 ; j<M ; j++) {
				//시작지점 확인
				if(map[i].charAt(j) == 'I') {
					start_row = i;
					start_col = j;
				}
			}
		}
		
		BFS(start_row, start_col);
		
		System.out.println((count==0) ? "TT" : count);
	}
}	
