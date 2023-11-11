import java.util.*;
import java.io.*;

//위치에 대한 클래스 노드 선언
class Node{
	int row;
	int col;
	
	Node(int row, int col){
		this.row = row;
		this.col = col;
	}
}

public class Main {
	static int H;
	static int W;
	static char[][] map;
	static boolean[][] visited;
	static int answer;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS함수
	static void BFS(int x, int y) {
		//BFS에 활용할 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//초기값 입력 및 방문처리
		queue.offer(new Node(x, y));
		visited[x][y] = true;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			Node now = queue.poll();
			
			//4가지 방향에 대해
			for(int i=0 ; i<4 ; i++) {
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//맵을 벗어나는거나 방문한적이 있는경우
				if(next_row<0 || next_row>=H || next_col<0 || 
				   next_col>=W || visited[next_row][next_col]) {
					continue;
				}
				
				//양이 없는경우 ('.')
				if(map[next_row][next_col] == '.') {
					continue;
				}
				
				//위 두가지 경우가 모두 아닌경우(양이 있는경우) 큐에 넣고 방문처리
				queue.offer(new Node(next_row, next_col));
				visited[next_row][next_col] = true;
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//그리드의 높이(행) H, 그리드의 너비(열) W 입력
    		st = new StringTokenizer(br.readLine());
    		H = Integer.parseInt(st.nextToken());
    		W = Integer.parseInt(st.nextToken());
    		
    		//정답변수 초기화
    		answer = 0;
    		
    		//맵 및 방문처리 배열 선언
    		map = new char[H][W];
    		visited = new boolean[H][W];
    		
    		//맵 입력
    		for(int i=0 ; i<H ; i++) {
    			map[i] = br.readLine().toCharArray();
    		}
    		
    		//맵의 시작점부터 끝까지
    		for(int i=0 ; i<H ; i++) {
    			for(int j=0 ; j<W ; j++) {
    				//방문한적이 없고 #(양)이라면 
    				if(!visited[i][j] && map[i][j]=='#') {
    					//BFS함수 실행 및 정답변수 증가
    					BFS(i, j);
    					
    					answer++;
    				}
    			}
    		}
    		
    		//무리의 수 입력
    		System.out.println(answer);
    	}
    }
}	
