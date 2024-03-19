import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int R;
	
	//방문 순서
	static int count = 1;
	
	//방문처리배열, 정답배열
	static boolean[] visited;
	static int[] answer;
	
	//정점 및 간선 표현 그래프
	static List<List<Integer>> graph = new ArrayList<>();
	
	//DFS함수
	static void DFS(int start) {
		//방문한적이 없다면
		if(!visited[start]) {
			//방문처리 후 정답배열에 넣어주기
			visited[start] = true;
			answer[start] = count++;
		}
		
		//인접한 정점에 대하여
		for(int number : graph.get(start)) {
			//방문한 적 없다면 재귀호출
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
    	
    	//방문처리 배열 및 정답배열 선언
    	visited = new boolean[N+1];
    	answer = new int[N+1];
    	
    	//그래프 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//M개의 간선 정보 입력
    	while(M-->0) {
    		//정점 u, v 입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 표현
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//정점을 내림차순으로 방문하므로 내림차순 정렬
    	for(int i=1 ; i<=N ; i++) {
    		Collections.sort(graph.get(i), Collections.reverseOrder());
    	}
    	
    	//시작정점부터 DFS 실시
    	DFS(R);
    	
    	//정답출력
    	for(int i=1 ; i<=N ; i++) {
    		System.out.println(answer[i]);
    	}
    }
}	
