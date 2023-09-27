import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	//행,열의 크기 및 맵
	static int N;
	static int[][] map;
	
	//방문처리 배열
	static boolean[][] visited;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//DFS함수
	public static int DFS(int x, int y, int height) {
		//방문처리
		visited[x][y] = true;
		
		//4가지 방향에 대해
		for(int i=0 ; i<4 ; i++) {
			//다음 노드
			int next_x = x + dx[i];
			int next_y = y + dy[i];
			
			//맵을 벗어났거나 방문한적이 있는 경우
			if(next_x<0 || next_y<0 || next_x>=N || next_y>=N || visited[next_x][next_y]) {
				continue;
			}
			
			//이외의 경우면서 현재 물높이보다 높은 영역일때
			if(map[next_x][next_y] > height) {
				//재귀적 호출
				DFS(next_x, next_y, height);
			}
		}
		//한 구역이 끝나면 1을 반환해 구역의 개수를 더해준다
		return 1;
	}
	
    public static void main(String[] args) throws IOException{
    	//DFS 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//지역을 나타내는 맵의 행,열 개수 N 입력 및 맵 선언
    	N = Integer.parseInt(br.readLine());
    	map = new int[N][N];
    	
    	//맵의 최대높이 변수
    	int max_Height = 0;
    	
    	//맵 정보 입력
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<N ; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    			
    			//최대높이 최신화
    			max_Height = Math.max(max_Height, map[i][j]);
    		}
    	}
    	
    	//안전영역 최대 개수
    	int max = 0;
    	
    	//물높이 0부터 max_Height까지 각 경우에 대한 안전구역 탐색
    	for(int height=0 ; height<max_Height+1 ; height++) {
    		//물 높이가 달라질때마다 방문처리배열 초기화
    		visited = new boolean[N][N];
    		
    		//높이에 따른 안전영역의 개수
    		int count = 0;
    		
    		//맵 모든영역에 대해 탐색 시작
    		for(int i=0 ; i<N ; i++) {
    			for(int j=0 ; j<N ; j++) {
    				//방문한적이 없고 현재구역이 물높이보다 높은경우
    				if(!visited[i][j] && map[i][j]>height) {
    					//DFS함수 실행
    					count += DFS(i, j, height);
    				}
    			}
    		}
    		
    		//구역의 최대값 저장
    		max = Math.max(max, count);
    	}
    	
    	System.out.println(max);
    }
}	
