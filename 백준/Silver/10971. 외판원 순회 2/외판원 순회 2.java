import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] W;
	
	//방문처리 배열
	static boolean[] visited;
	
	//정답 변수
	static int answer = Integer.MAX_VALUE;
	
	//DFS함수
	static void DFS(int start, int now, int sum, int depth) {
		//깊이가 N-1이 됐을때
		if(depth == N-1) {
			if(W[now][start] > 0) {
				//현재 도시에서 시작 도시까지 가는 비용을 더해주기
				sum += W[now][start];
				
				//최솟값
				answer = Math.min(answer, sum);
				
			}
			return;
		}
		
		for(int i=1 ; i<=N ; i++) {
			//방문한적이 없고 자기자신에게 가는게 아닌경우
			if(!visited[i] && W[now][i]!=0) {
				//방문처리
				visited[i] = true;
				
				//재귀호출
				DFS(start, i, sum+W[now][i], depth+1);
				
				visited[i] = false;
			}
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//도시의 수 N 입력
    	N = Integer.parseInt(br.readLine());
    	
    	//비용행렬 선언 및 값 입력
    	W = new int[N+1][N+1];
    	
    	for(int i=1 ; i<=N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=1 ; j<=N ; j++) {
    			W[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	visited = new boolean[N+1];
    	
    	//각 도시에 대한 순회 실시
    	for(int i=1 ; i<=N ; i++) {
    		//시작도시 방문처리
    		visited[i] = true;
    		
    		//DFS함수
    		DFS(i, i, 0, 0);
    		
    	}
    	
    	System.out.println(answer);
    }
}	
