import java.util.*;
import java.io.*;

//좌표를 위한 클래스 노드
class Node{
	int row;
	int col;
	
	Node(int row, int col){
		this.row = row;
		this.col = col;
	}
}

public class Main {
	static int N, M;
	static int[][] map;
	
	//안전영역외 최댓값을 위해 최솟값으로 초기값 설정
	static int max = Integer.MIN_VALUE;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//DFS함수(파라미터 : 설치된 벽의 수)
	static void DFS(int wall) {
		//설치된 벽이 3개가 된 경우 BFS 시작
		if(wall == 3) {
			BFS();
			
			return;
		}
		
		//맵정보에 대해
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				//'0'(빈 칸)인 경우 '1'(벽)을 세운 후 재귀호출(벽 개수 하나 증가)
				if(map[i][j] == 0) {
					map[i][j] = 1;
					DFS(wall+1);
					map[i][j] = 0;
				}
			}
		}
	}
	
	//BFS함수
	static void BFS() {
		//활용할 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				//'2'(바이러스)를 만나게되면
				if(map[i][j] == 2) {
					//큐에 넣어주기
					queue.offer(new Node(i, j));
				}
			}
		}
		
		//맵 복제본 선언 및 값 넣어주기
		int[][] copyMap = new int[N][M];
		for(int i=0 ; i<N ; i++) {
			copyMap[i] = map[i].clone();
		}
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			Node now = queue.poll();
			
			//4가지 방향에 대해
			for(int i=0 ; i<4 ; i++) {
				//다음 노드의 좌표
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵을 벗어나거나 0이 아닌경우
				if(next_row<0 || next_row>=N || next_col<0 || next_col>=M ||
				   copyMap[next_row][next_col]!=0) {
					continue;
				}
				
				//큐에 넣어주고 복제맵에 2로 표시해주기
				queue.offer(new Node(next_row, next_col));
				copyMap[next_row][next_col] = 2;
			}
		}
		
		//탐색이 끝난 후 안전영역의 개수 구하기
		int safe = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(copyMap[i][j] == 0) {
					safe++;
				}
			}
		}
		
		//안전영역의 최댓값 최신화
		max = Math.max(max, safe);
	}
	
    public static void main(String[] args) throws IOException {
    	//DFS + BFS 같이 응용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//맵의 행(N), 열(M) 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	//맵 선언 및 정보 입력
    	map = new int[N][M];
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<M ; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	
    	DFS(0);
    	
    	System.out.println(max);
    }
}	
