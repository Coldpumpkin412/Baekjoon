import java.util.*;
import java.io.*;

public class Main {
	static int N;
    
	//방문처리용 배열
	static boolean[][] visited;
	
	//N x N그리드 선언
	static char[][] Grid;
	
	//적록색약이 아닌사람과 적록색약인 사람의 정답
	static int color, color_Weakness;
	
	//좌표이동에 활용될 변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//DFS함수
	public static void DFS(int row, int col) {
		//파라미터를 인덱스로 방문처리
		visited[row][col] = true;
		//현재 인덱스의 색
		char now_color = Grid[row][col];
		
		//상하좌우 좌표이동
		for(int i=0 ; i<4 ; i++) {
			//다음 좌표 선언
			int next_Row = row + dx[i];
			int next_Col = col + dy[i];
			
			//범위를 벗어나는 경우 continue
			if(next_Row<0 || next_Col<0 || next_Row>=N || next_Col>=N) continue;
			
			//범위내에서 다음좌표의 값이 현재좌표의 값과 같으며 방문한적이 없는경우
			if(Grid[next_Row][next_Col]==now_color && !visited[next_Row][next_Col]) {
				//재귀적 호출
				DFS(next_Row, next_Col);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * DFS활용하여 풀기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//NxN그리드 선언을 위해 N 입력
		N = Integer.parseInt(br.readLine());
		
		//그리드 및 방문처리용 배열 초기화
		visited = new boolean[N][N];
		Grid = new char[N][N];
		
		//그리드(맵) 값 입력
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
			for(int j=0 ; j<N ; j++) {
				Grid[i][j] = str.charAt(j);
			}
		}
		
		//적록색약이 아닌사람의 구역의 개수
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				//방문한 적이 없다면 DFS
				if(!visited[i][j]) {
					DFS(i, j);
					color++;
				}
			}
			
		}
		
		//적록색약인 경우 G를 R로 변경 및 방문처리용 배열 초기화
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(Grid[i][j]=='G') Grid[i][j] = 'R';
			}
		}
		
		visited = new boolean[N][N];
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				//방문한 적이 없다면 DFS
				if(!visited[i][j]) {
					DFS(i, j);
					color_Weakness++;
				}
			}
		}
		
		System.out.println(color + " " + color_Weakness);
	}
}

	
