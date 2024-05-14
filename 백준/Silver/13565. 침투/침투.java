import java.util.*;
import java.io.*;

//좌표 노드
class Node{
	int row;
	int col;
	
	public Node(int row, int col) {
		this.row = row;
		this.col = col;
	}
}

public class Main {
	static int M;
	static int N;
	static int[][] graph;
	
	//방문체크 변수
	static boolean[][] visited;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS 함수
	static void BFS(int row, int col) {
		//활용할 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//초기위치 방문처리
		visited[row][col] = true;
		
		//초기값 넣어주기
		queue.offer(new Node(row, col));
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재 노드
			Node now = queue.poll();
			
			//4가지 방향에 대해
			for(int i=0 ; i<4 ; i++) {
				//다음 노드의 좌표
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵을 벗어나는경우
				if(next_row<0 || next_row>=M || next_col<0 || next_col>=N) {
					//넘어가기
					continue;
				}
				
				//전류가 흐르지 않거나 방문한적이 있는경우
				if(graph[next_row][next_col]==1 || visited[next_row][next_col]) {
					continue;
				}
				
				//방문처리
				visited[next_row][next_col] = true;
				
				//아니라면 큐에 넣어주기
				queue.offer(new Node(next_row, next_col));
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//격자의 크기(행 M, 열 N) 입력
    	st = new StringTokenizer(br.readLine());
    	M = Integer.parseInt(st.nextToken());
    	N = Integer.parseInt(st.nextToken());
    	
    	//그래프 선언
    	graph = new int[M][N];
    	
    	//방문체크 변수 선언
    	visited = new boolean[M][N];
    	
    	//그래프 입력
    	for(int i=0 ; i<M ; i++) {
    		String str = br.readLine();
    		
    		for(int j=0 ; j<N ; j++) {
    			graph[i][j] = str.charAt(j)-'0';
    		}
    	}
    	
    	//바깥쪽 전류(0번째 행)에 대해 BFS 실시
    	for(int i=0 ; i<N ; i++) {
    		//전류가 흐르는 곳(0)이고 방문한적이 없을떄
    		if(graph[0][i]==0 && !visited[0][i]) {
    			//방문처리
    			visited[0][i] = true;
    			
    			//BFS함수
    			BFS(0, i);    			
    		}
    	}
    	
    	//마지막 행에 방문처리가 하나라도 있으면 YES를, 아니면 NO를 출력
    	for(int i=0 ; i<N ; i++) {
    		if(visited[M-1][i]) {
    			System.out.println("YES");
    			return;
    		}
    	}
    	
    	System.out.println("NO");
    }
}	
