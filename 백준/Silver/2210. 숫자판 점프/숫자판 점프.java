import java.util.*;
import java.io.*;

public class Main {
	//숫자배열들 저장할 리스트
	static List<String> list = new ArrayList<>();

	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//DFS함수
	public static void DFS(String[][] map, int x, int y, String value, int count) {
		//카운트가 5(숫자 길이가 6자리)라면
		if(count == 5) {
			//리스트에 저장된 값이 존재하지않는 경우 값 추가
			if(!list.contains(value)) {
				list.add(value);
			}
			
			return;
		}
		
		//4방향에 대해 실행
		for(int i=0 ; i<4 ; i++) {
			int next_x = x + dx[i];
			int next_y = y + dy[i];
			
			//맵에 벗어나지않는경우
			if(0<=next_x && next_x<5 && 0<=next_y && next_y<5) {
				//재귀호출(숫자는 현재까지 저장 및 카운트 증가
				DFS(map, next_x, next_y, value+map[next_x][next_y], count+1);
			}
		}
	}
	
    public static void main(String[] args) throws IOException{
    	//DFS 활용
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//숫자판 저장 배열 선언
    	String[][] map = new String[5][5];
    	
    	//숫자판 입력
    	for(int i=0 ; i<5 ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<5 ; j++) {
    			map[i][j] = st.nextToken();
    		}
    	}
    	
    	//모든 구간에 대해 DFS 실행
    	for(int i=0 ; i<5 ; i++) {
    		for(int j=0 ; j<5 ; j++) {
    			DFS(map, i, j, map[i][j], 0);
    		}
    	}
    	
    	System.out.println(list.size());
    }
}	
