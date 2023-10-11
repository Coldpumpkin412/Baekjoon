import java.util.*;
import java.io.*;

public class Main {
	static int M, N, K;
	static int[][] map;
    
	//방향 변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//넓이 저장용 배열
	static List<Integer> list = new ArrayList<>();
	static int answer;
	
	//DFS함수
	static void DFS(int row, int col) {
		map[row][col] = 1;
		
		//영역 한칸당 넓이 1씩 추가
		answer++;
		
		//4가지 방향에 대해
		for(int i=0 ; i<4 ; i++) {
			int next_row = row + dx[i];
			int next_col = col + dy[i];
			
			//맵을 벗어나지않고 방문한적이 없다면
			if(0<=next_row && next_row<M && 
			   0<=next_col && next_col<N && map[next_row][next_col]==0) {
				//재귀호출
				DFS(next_row, next_col);
			}
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//M(행), N(열), K(직사각형의 개수) 입력
    	st = new StringTokenizer(br.readLine());
    	M = Integer.parseInt(st.nextToken());
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//모눈종이를 2차원 배열로 표시
    	map = new int[M][N];
    	
    	//맵 설정
    	while(K-->0) {
    		//직사각형 왼쪽아래 좌표, 오른쪽 위 좌표 입력
    		st = new StringTokenizer(br.readLine());
    		int x1 = Integer.parseInt(st.nextToken());
    		int y1 = Integer.parseInt(st.nextToken());
    		int x2 = Integer.parseInt(st.nextToken());
    		int y2 = Integer.parseInt(st.nextToken());
    		
    		//직사각형 영역들을 1로 초기화 및 방문처리
    		for(int i=x1 ; i<x2 ; i++) {
    			for(int j=y1 ; j<y2 ; j++) {
    				map[j][i] = 1;
    			}
    		}
    	}
    	
    	for(int i=0 ; i<M ; i++) {
    		for(int j=0 ; j<N ; j++) {
    			if(map[i][j] == 0) {
    				//직사각형이 없는곳이라면 DFS함수 실행
    				answer = 0;

    				DFS(i, j);
    				
    				list.add(answer);
    			}
    		}
    	}
    	
    	//리스트 오름차순 정렬
    	Collections.sort(list);
    	
    	//영역의 개수 출력
    	System.out.println(list.size());
    	
    	//각 영역의 넓이 출력
    	for(int num : list) {
    		System.out.print(num + " ");
    	}
    }
}	
