import java.util.*;
import java.io.*;

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
	static char[][] map;
	static boolean[][] visited;
	
	//흰 옷 병사, 파란옷 병사 누적 위력
	static int sum_W;
	static int sum_B;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS함수
	static void BFS(int row, int col, char ch) {
		//홯용할 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//해당 구역의 병사위력
		int curW = 0;
		int curB = 0;
		
		//초기값 넣어준 후 방문처리
		queue.offer(new Node(row, col));
		visited[row][col] = true;
		
		//초기 값이 W인경우
		if(map[row][col] == 'W') {
			//큐가 빌 때까지
			while(!queue.isEmpty()) {
				//현재노드
				Node now = queue.poll();
				
				//W 위력 추가
				curW++;
				
				//4가지 방향에 대해
				for(int i=0 ; i<4 ; i++) {
					int next_row = now.row + dx[i];
					int next_col = now.col + dy[i];
					
					//맵을 벗어나거나 방문한적이 있거나 B인경우
					if(0>next_row || next_row>=M || 0>next_col || next_col>=N ||
					   visited[next_row][next_col] || map[next_row][next_col]=='B') {
						continue;
					}
					
					//큐에 넣어준 후 방문처리
					queue.offer(new Node(next_row, next_col));
					visited[next_row][next_col] = true;
				}
			}
			
			//누적값 최신화
			sum_W += Math.pow(curW, 2);
		}else {//초기 값이 B인 경우
			//큐가 빌 때까지
			while(!queue.isEmpty()) {
				//현재노드
				Node now = queue.poll();
				
				//W 위력 추가
				curB++;
				
				//4가지 방향에 대해
				for(int i=0 ; i<4 ; i++) {
					int next_row = now.row + dx[i];
					int next_col = now.col + dy[i];
					
					//맵을 벗어나거나 방문한적이 있거나 B인경우
					if(0>next_row || next_row>=M || 0>next_col || next_col>=N ||
					   visited[next_row][next_col] || map[next_row][next_col]=='W') {
						continue;
					}
					
					//큐에 넣어준 후 방문처리
					queue.offer(new Node(next_row, next_col));
					visited[next_row][next_col] = true;
				}
			}
			
			//누적값 최신화
			sum_B += Math.pow(curB, 2);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	//BFS활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//전쟁터 가로크기 N, 세로크기 M 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	//전쟁터 배열 선언
    	map = new char[M][N];
    	
    	//방문처리 배열 선언
    	visited = new boolean[M][N];
    	
    	//병사 입력
    	for(int i=0 ; i<M ; i++) {
    		map[i] = br.readLine().toCharArray();
    	}
    	
    	for(int i=0 ; i<M ; i++) {
    		for(int j=0 ; j<N ; j++) {
    			//방문한적이 없다면
    			if(!visited[i][j]) {
    				BFS(i, j, map[i][j]);
    			}
    		}
    	}
    	
    	System.out.println(sum_W + " " + sum_B);
    }
}	
