import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int R;

	//방문순서 저장 배열
	static int[] answer; 
	
	//방문 순서 변수
	static int count = 1;
	
	//방문처리 배열
	static boolean[] visited;
	
	//정점 연결상태를 표시할 그래프 선언
	static List<List<Integer>> graph = new ArrayList<>();
	
	//DFS함수
	static void DFS(int start) {
		//해당 정점을 방문한 적이 없다면 
		if(!visited[start]) {
			//방문처리
			visited[start] = true;
			
			//순서 입력
			answer[start] = count++;
		}
		
		//start와 인접 정점에 대해
		for(int number : graph.get(start)) {
			//인접 정점을 방문한 적 없다면 재귀호출
			if(!visited[number]) {
				DFS(number);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정점의 수 N, 간선의 수 M, 시작 정점 R 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	R = Integer.parseInt(st.nextToken());
    	
    	//방문처리배열 선언
    	visited = new boolean[N+1];
    	
    	//방문순서배열 선언
    	answer = new int[N+1];
    	
    	//그래프 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//간선정보 M개 입력
    	for(int i=0 ; i<M ; i++) {
    		//정점 u, v 입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 표현
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//오름차순으로 방문하기때문에 정렬
    	for(int i=1 ; i<=N ; i++) {
    		Collections.sort(graph.get(i));
    	}
    	
    	//시작정점부터 DFS 실행
    	DFS(R);
    	
    	//결과출력
    	for(int i=1 ; i<=N ; i++) {
    		System.out.println(answer[i]);
    	}
    }
}	
