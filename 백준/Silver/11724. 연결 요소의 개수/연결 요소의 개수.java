import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static int[][] graph;
	static boolean[] visited; 
	
	public static void DFS(int number) {
		visited[number] = true; //방문처리
		
		for(int i=1 ; i<=N ; i++) {
			//간선이 연결돼있고 방문한 적이 없다면 DFS 재귀적으로 호출
			if(graph[number][i]==1 && !visited[i]) {
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * DFS를 활용하여 각 노드들을 방문처리 해주며 탐색.
		 * DFS함수가 시행된 횟수가 연결요소(간선)의 개수라고 할 수 있음
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//정점의 개수 및 간선의 개수 입력
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//dfs에 활용할 그래프 선언 및 정점 선언
		graph = new int[N+1][N+1];
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			
			//인접그래프 입력
			graph[row][col] = 1;
			graph[col][row] = 1;
		}
		
		//방문처리용 배열 선언
		visited = new boolean[N+1];
		
		int answer=0;
		for(int i=1 ; i<N+1 ; i++) {
			//방문한 적이 없다면 DFS함수 시행 후 answer++
			if(!visited[i]) {
				DFS(i);
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}

	
