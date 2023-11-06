import java.util.*;
import java.io.*;

class Node{
	int row;
	int col;
	boolean check; //벽을 부순 경험이 있는지 여부(부순적 있으면 true로 변경)
	int distance;
	
	Node(int row, int col, boolean check, int distance){
		this.row = row;
		this.col = col;
		this.check = check; 
		this.distance = distance;
	}
}

public class Main {
	//맵의 행 수(N), 열 수(M)
	static int N, M;
	
	//맵
	static char[][] map;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//방문처리 배열(벽 부심 여부에 따라 두 개가 필요하므로 3차원 배열 선언)
	static boolean[][][] visited;
	
	//도착지 도달했는지 확인 변수
	static boolean goal = false;
	
	static void BFS(int row, int col, int distance) {
		//큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//초기값 입력 및 방문처리
		queue.offer(new Node(row, col, false, distance));
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재 노드
			Node now = queue.poll();
			
			//현재 노드의 행, 열이 도착지점인 경우
			if(now.row==N-1 && now.col==M-1) {
				//거리 출력 후 종료
				System.out.println(now.distance);
				
				goal = true;
				
				return;
			}
			
			//4가지 방향에 대해
			for(int i=0 ; i<4 ; i++) {
				//다음 노드의 행, 열 값
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵을 벗어난경우
				if(next_row<0 || next_row>=N || next_col<0 || next_col>=M) {
					continue;
				}
				
				//벽이 아닌경우
				if(map[next_row][next_col] == '0') {
					//부신 벽이 여태 없고 방문한 적이 없는경우
					if(now.check==false && !visited[next_row][next_col][0]) {
						//큐에 넣고 방문처리
						queue.offer(new Node(next_row, next_col, false, now.distance+1));
						visited[next_row][next_col][0] = true;
					}else if(now.check==true && !visited[next_row][next_col][1]) {//벽을 부신적이 있는경우
						//큐에 넣고 방문처리
						queue.offer(new Node(next_row, next_col, true, now.distance+1));
						visited[next_row][next_col][1] = true;
					}
				}else if(map[next_row][next_col] == '1') {//벽인 경우
					//벽을 한 번도 부순적이 없다면 부수고 이동
					if(now.check == false) {
						//큐에 넣고 방문처리
						queue.offer(new Node(next_row, next_col, true, now.distance+1));
						visited[next_row][next_col][1] = true;
					}
				}
			}
		}
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//맵의 행, 열 수 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	visited = new boolean[N][M][2];
    	
    	//맵 정보
    	map = new char[N][M];
    	for(int i=0 ; i<N ; i++) {
    		String str = br.readLine();
    		
    		map[i] = str.toCharArray();
    	}
    	
    	//시작점 포함해서 세기
    	BFS(0, 0, 1);
    	
    	//목적지 도착 못했으면 -1 출력
    	if(!goal) {
    		System.out.println(-1);
    	}
    }
}	
