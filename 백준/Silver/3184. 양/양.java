import java.util.*;
import java.io.*;

public class Main {
	static int R, C;
	static char[][] map;
	static boolean[][] visited;
	
	//양, 늑대 누적 개수
	static int sum_sheep;
	static int sum_wolf;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//BFS함수
	public static void BFS(int row, int col) {
		//큐 선언
		Queue<int[]> queue = new LinkedList<>();
		
		int sheep = 0;
		int wolf = 0;
		
		//초기값 입력 및 방문처리
		queue.offer(new int[]{row, col});
		visited[row][col] = true;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재 노드
			int[] now = queue.poll();
			
			
			if(map[now[0]][now[1]]=='o') {
				sheep++;
			}else if(map[now[0]][now[1]]=='v') {
				wolf++;
			}
			
			for(int i=0 ; i<4 ; i++) {
				int next_row = now[0] + dx[i];
				int next_col = now[1] + dy[i];
				
				//맵을 벗어나거나, 울타리에 부딪히거나, 방문한적이 있는경우
				if(next_row<0 || R<=next_row || next_col<0 || C<=next_col || 
				   map[next_row][next_col]=='#' || visited[next_row][next_col]) {
					continue;
				}
				
				//방문처리 및 큐에 넣어주기
				visited[next_row][next_col] = true;
				queue.offer(new int[] {next_row, next_col});
			}
		}
		
		//양의 수가 더 많은경우
		if(sheep > wolf) {
			sum_sheep += sheep;
		}else {
			sum_wolf += wolf;
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	//BFS활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//마당의 행 R, 열 C 입력
    	st = new StringTokenizer(br.readLine());
    	R = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	
    	//마당 배열 및 방문처리 배열 선언
    	map = new char[R][C];
    	visited = new boolean[R][C];
    	
    	//마당 입력
    	for(int i=0 ; i<R ; i++) {
    		map[i] = br.readLine().toCharArray();
    	}
    	
    	for(int i=0 ; i<R ; i++) {
    		for(int j=0 ; j<C ; j++) {
    			//방문한적이 없는경우 BFS함수
    			if(!visited[i][j] && map[i][j]!='#') {
    				BFS(i, j);
    			}
    		}
    	}
    	
    	System.out.println(sum_sheep + " " + sum_wolf);
    }
}	