import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int R;
	
	//노드의 깊이 저장 배열 d, 방문순서 배열 t 선언
	static long[] D;
	static long[] T;
	
	//깊이변수 및 방문순서 변수
	static long count = 1;
	
	//방문처리 배열
	static boolean[] visited;
	
	//노드를 표시할 그래프
	static List<List<Integer>> graph = new ArrayList<>(); 
	
	//DFS 함수
	static void DFS(int start, int depth) {
		//방문한 적이 없다면
		if(!visited[start]) {
			//방문처리
			visited[start] = true;
			
			//해당 노드에 대한 깊이 및 방문횟수 저장
			D[start] = depth;
			T[start] = count++;
		}
		
		//인접정점에 대하여
		for(int number : graph.get(start)) {
			//방문한적이 없다면
			if(!visited[number]) {
				//재귀호출(깊이 증가)
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
    	
    	//d 배열, t 배열, 방문처리 배열 초기화
    	D = new long[N+1];
    	T = new long[N+1];
    	visited = new boolean[N+1];
    	
    	Arrays.fill(D, -1);
    	Arrays.fill(T, 0);
    	
    	//리스트 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//간선정보 M개 입력
    	while(M-->0) {
    		//정점 u, v입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 표현
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//인접정점을 오름차순으로 방문하므로 정렬
    	for(int i=1 ; i<=N ; i++) {
    		Collections.sort(graph.get(i));
    	}
    	
    	//DFS함수 실행
    	DFS(R, 0);
    	
    	//정답변수
    	long answer = 0;
    	
    	for(int i=1 ; i<=N ; i++) {
    		answer += D[i]*T[i];
    	}
    	
    	System.out.println(answer);
    	
    }
}	
