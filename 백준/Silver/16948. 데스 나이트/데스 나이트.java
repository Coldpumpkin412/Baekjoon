import java.util.*;
import java.io.*;

//Node 클래스 선언(행, 열, 이동거리)
class Node{
	int row;
	int col;
	int distance;
	
	Node(int row, int col, int distance) {
		this.row = row;
		this.col = col;
		this.distance = distance;
	}
}

public class Main {
	//체스판 크기
	static int N;
	
	//체스판
	static int[][] map;
	
	//방문처리 배열
	static boolean[][] visited;
	
	//방향 변수
	static int[] dx = {-2,-2,0,0,2,2};
	static int[] dy = {-1,1,-2,2,-1,1};
	
	static void BFS(int r1, int c1, int r2, int c2) {
		//활용할 큐 선언
		Queue<Node> queue = new LinkedList<>(); 
		
		//초기값 넣어주기
		queue.offer(new Node(r1, c1, 0));
		
		//방문처리
		visited[r1][c1] = true;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			Node now = queue.poll();
			
			//방향에따라
			for(int i=0 ; i<6 ; i++) {
				//다음노드
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵에 벗어나거나 방문한적이 있는 경우
				if(next_row<0 || next_row>=N || next_col<0 || next_col>=N || visited[next_row][next_col]) {
					continue;
				}
				
				//도착점과 일치하는경우 거리에 1더한 후 출력 및 종료
				if(next_row==r2 && next_col==c2) {
					System.out.println(now.distance + 1);
					return;
				}
				
				//조건은 맞으나 도착점이 아니라면 방문처리 후 큐에 넣기(이동거리는 1 증가)
				visited[next_row][next_col] = true;
				queue.offer(new Node(next_row, next_col, now.distance+1));
			}
		}
		
		//전부 다 돌았으나 함수가 종료되지않았으면 -1 출력 후 종료
		System.out.println(-1);
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//체스판 크기 입력
    	N = Integer.parseInt(br.readLine());
    	
    	//체스판 및 방문처리 배열 선언
    	map = new int[N][N];
    	visited = new boolean[N][N];
    	
    	//시작점(r1, c1)과 도착점 (r2, c2) 입력
    	st = new StringTokenizer(br.readLine());
    	int r1 = Integer.parseInt(st.nextToken());
    	int c1 = Integer.parseInt(st.nextToken());
    	int r2 = Integer.parseInt(st.nextToken());
    	int c2 = Integer.parseInt(st.nextToken());
    	
    	//BFS함수 실행
    	BFS(r1, c1, r2, c2);
    	
    }
}	
