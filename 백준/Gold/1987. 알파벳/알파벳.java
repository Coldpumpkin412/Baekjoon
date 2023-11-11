import java.util.*;
import java.io.*;

public class Main {
	static int R;
	static int C;
	static char[][] map;
	static boolean[] visited;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static int answer = 0;
	
	static void DFS(int row, int col, int distance) {
		//현재 위치에 해당하는 알파벳 방문처리
		visited[map[row][col]-'A'] = true;
		
		//정답변수 최댓값으로 최신화
		answer = Math.max(answer, distance);
		
		//4가지 방향에대해
		for(int i=0 ; i<4 ; i++) {
			int next_row = row + dx[i];
			int next_col = col + dy[i];
			
			//맵을벗어나거나 방문한적이 있는경우
			if(next_row<0 || next_row>=R || next_col<0 || next_col>=C 
			   || visited[map[next_row][next_col]-'A']) {
				continue;
			}
			
			//조건을 만족하면 재귀호출 및 이동거리 증가
			DFS(next_row, next_col, distance+1);
			
			//재귀가 끝나면 다시 false로 돌려주기
			visited[map[next_row][next_col]-'A'] = false;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//맵의 행 수(R), 열 수(C) 입력
    	st = new StringTokenizer(br.readLine());
    	R = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	
    	//이전에 방문한 알파벳인지 확인하기위해 26개짜리 boolean배열 선언
    	visited = new boolean[26];
    	
    	//맵 선언 및 정보 입력
    	map = new char[R][C];
    	for(int i=0 ; i<R ; i++) {
    		map[i] = br.readLine().toCharArray();
    	}
    	
    	//시작점기준으로 DFS 실행(시작점도 칸 수의 포함이므로 마지막 파라미터는 1로 시작)
    	DFS(0, 0, 1);
    	
    	System.out.println(answer);
    }
}	
