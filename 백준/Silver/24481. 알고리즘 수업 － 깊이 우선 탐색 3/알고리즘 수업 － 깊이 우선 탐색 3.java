import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int R;
	
	//방문처리배열 및 정답배열
	static boolean[] visited;
	static int[] answer;
	
	//정점 및 간선 표현 그래프
	static List<List<Integer>> graph = new ArrayList<>();
	
	//DFS함수
	static void DFS(int start, int depth) {
		//방문한적이 없다면
		if(!visited[start]) {
			//방문처리 후 깊이값 저장
			visited[start] = true;
			
			answer[start] = depth;
		}
		
		//인접 정점에 대하여
		for(int number : graph.get(start)) {
			//방문한 적이 없다면
			if(!visited[number]) {
				//재귀 호출
				//호출을 한 번 할 때마다 깊이를 1 증가한다
				//같은 부모에 대해 깊이가 달라지는것을 방지하기위해 후위연산자는 사용X
				DFS(number, depth+1);
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
    	
    	//방문처리배열 및 정답배열 선언
    	visited = new boolean[N+1];
    	answer = new int[N+1];
    	
    	//정답배열의 초기값을 -1로 설정
    	Arrays.fill(answer, -1);
    	
    	//그래프 초기화
    	for(int i=0 ; i<= N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//간선정보 입력
    	while(M-->0) {
    		//정점 u, v 입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 그래프
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//정점번호를 오름차순으로 방문하므로 정렬
    	for(int i=1 ; i<=N ; i++) {
    		Collections.sort(graph.get(i));
    	}
    	
    	//시작정점부터 DFS 실시(시작정점, 깊이)
    	DFS(R, 0);
    	
    	//결과출력
    	for(int i=1 ; i<=N ; i++) {
    		System.out.println(answer[i]);
    	}
    }
}	
