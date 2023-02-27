import java.util.*;
import java.io.*;

public class Main {
	
	//배추밭을 표시할 그래프배열과 방문처리용 배열 선언
	static int[][] graph;
	static boolean[][] visited;
	
	static int M,N,K,result; //가로 및 세로길이와 지렁이의 수
	
	//방향변수
	static int[] dirX = {-1,1,0,0};
	static int[] dirY = {0,0,1,-1};
	
	//DFS함수
	static void DFS(int x, int y) {
		visited[x][y] = true; //방문처리
		
		for(int i=0 ; i<4 ; i++) {
			//새로운 x,y값
			int newX = x + dirX[i];
			int newY = y + dirY[i];
			
			//새로운 좌표가 범위에 벗어나지않고
			if(newX>=0 && newX<M && newY>=0 && newY<N) {
				//배추가심어져있으며 방문한적이없다면 DFS 재귀적 호출
				if( !visited[newX][newY] && graph[newX][newY]==1) {
					DFS(newX, newY);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트케이스 개수(T) 입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			//필요한 지렁이의 수
			result = 0;
			
			//가로길이(M), 세로길이(N), 배추가 심어져있는 위치의 개수(K) 입력
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			//배추밭을 표시할 2차원 배열 및 방문처리배열 사이즈 선언
			graph = new int[M][N];
			visited = new boolean[M][N];
			
			//배추가 심어져있는 곳(그래프정보) 입력
			for(int j=0 ; j<K ; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int row = Integer.parseInt(st.nextToken());
				int col = Integer.parseInt(st.nextToken());
				
				graph[row][col] = 1; //배추가 심어져있는 곳 표시
			}
			
			for(int x=0 ; x<M ; x++) {
				for(int y=0 ; y<N ; y++) {
					//(x,y)에 배추가 있고 방문한 적이 없다면
					if(graph[x][y]==1 && !visited[x][y]) {
						//DFS함수 실행 및 지렁이의 수 증가
						DFS(x,y);
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
		
	}
}

	
