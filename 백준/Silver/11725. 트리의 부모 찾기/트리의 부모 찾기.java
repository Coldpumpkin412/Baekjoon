import java.util.*;
import java.io.*;

public class Main {
	
	static int N;
	static int[] parents;
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	
	//dfs함수
	private static void dfs(int x) {
		//현재 노드 방문처리
		visited[x]=true;
		
		for(int idx : list[x]) {
			
			//방문한 적이 없는 노드라면
			if(!visited[idx]) {
				//부모배열에 저장 후
				parents[idx] = x;
				
				//재귀적 호출
				dfs(idx);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//노드 개수 N ㅇ비력
		N = Integer.parseInt(br.readLine());
		
		//출력용 부모저장노드
		parents = new int[N+1];
		
		//방문처리 배열
		visited = new boolean[N+1];
		
		//dfs에 활용할 배열
		list = new ArrayList[N+1];
		
		//리스트 초기화
		for (int i=1 ;  i<=N ; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i=0 ; i<N-1 ; i++) {
			//트리 상에 연결될 정점 입력
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list[u].add(v);
			list[v].add(u);
		}
		
		//루트를 1부터로 가정했으므로 1로 메소드 실행
		dfs(1);
		
		//결과 출력(2번~N번 노드의 부모노드)
		for (int i=2 ; i<=N ; i++) {
			System.out.println(parents[i]);
		}
	}
}	
