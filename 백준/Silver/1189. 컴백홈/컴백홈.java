import java.util.*;
import java.io.*;

public class Main {
	//행, 열, 목표거리 변수
	static int R;
	static int C;
	static int K;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//방문처리 배열
	static boolean[][] visited;
	
	//맵 배열
	static char[][] map;
	
	//정답변수
	static int answer = 0;
	
	static void DFS(int row, int col, int distance) {
		//목적지 도착한 경우 이동거리가 K라면
		if(row==0 && col==C-1 && distance==K) {
			answer++;
			return;
		}
		
		//4가지 방향에 대해
		for(int i=0 ; i<4 ; i++) {
			int next_row = row + dx[i];
			int next_col = col + dy[i];
			
			//맵을 벗어나거나, 방문한적이 있거나, T(장애물)인 경우
			if(next_row<0 || next_row>=R || next_col<0 || next_col>=C ||
			   visited[next_row][next_col] || map[next_row][next_col]=='T') {
				
				//다음 경우로 넘어가기
				continue;
			}
			
			//방문처리
			visited[next_row][next_col] = true;
			
			//재귀호출(이 때 이동거리 1 증가)
			DFS(next_row, next_col, distance+1);
			
			//재긔에서 벗어날 때 방문처리 제거해주어 다른경우 간섭x
			visited[next_row][next_col] = false;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //행의 수 R, 열의 수 C , 거리 K 입력
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        //방문처리 배열
        visited = new boolean[R][C];
        
        //맵 값 입력
        map = new char[R][C];
        for(int i=0 ; i<R ; i++) {
        	char[] ch = br.readLine().toCharArray();
        	
        	for(int j=0 ; j<C ; j++) {
        		map[i][j] = ch[j];
        	}
        }
        
        //한수 시작지점 방문처리
        visited[R-1][0] = true;
        
        //DFS함수 실행(시작점부터 거리 1로 지정)
        DFS(R-1, 0, 1);
        
        System.out.println(answer);
    }
}	
