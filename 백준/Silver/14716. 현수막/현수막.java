import java.util.*;
import java.io.*;

class Node{
	int row;
	int col;
	
	public Node(int row, int col){
		this.row = row;
		this.col = col;
	}
}

public class Main {
	//현수막 크기 M, N
	static int M, N;
	
	//현수막
	static int[][] map;
	
	//방문처리 배열
	static boolean[][] visited;
	
	//방향변수
	static int[] dx = {-1,1,0,0,-1,-1,1,1};
	static int[] dy = {0,0,-1,1,-1,1,-1,1};
	
	static int answer = 0;
	
	
	//BFS함수
	static void BFS(int row, int col) {
		//큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//초기값 입력 및 방문처리
		queue.offer(new Node(row, col));
		visited[row][col] = true;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재 노드
			Node now = queue.poll();
			
			//8가지 방향에 대해(상,하,좌,우,대각선)
			for(int i=0 ; i<8 ; i++) {
				//다음 노드 행, 열
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵을 벗어나거나, 방문한적이 있거나, 0이라면 continue
				if(next_row<0 || next_row>=M || next_col<0 || next_col>=N ||
				   visited[next_row][next_col] || map[next_row][next_col]==0) {
					continue;
				}
				
				//방문처리 및 큐에 추가
				visited[next_row][next_col] = true;
				
				queue.offer(new Node(next_row, next_col));
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //현수막 크기 M, N 입력
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        //방문처리 배열 선언
        visited = new boolean[M][N];
        
        //현수막 선언 및 값 입력
        map = new int[M][N];
        for(int i=0 ; i<M ; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0 ; j<N ; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        //현수막 값을 하나씩 확인하며
        for(int i=0 ; i<M ; i++) {
        	for(int j=0 ; j<N ; j++) {
        		//값이 1이고 방문한적이 없는경우 BFS 실행
        		if(map[i][j]==1 && !visited[i][j]) {
        			BFS(i, j);
        			
        			answer++;
        		}
        	}
        }
        
        System.out.println(answer);
    }
}	
