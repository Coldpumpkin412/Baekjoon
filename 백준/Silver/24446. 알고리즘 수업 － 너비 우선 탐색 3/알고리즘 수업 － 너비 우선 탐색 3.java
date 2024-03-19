import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int R;
	
	//방문처리배열 및 정답배열
	static boolean[] visited;
	static int[] answer;
	
	//정점 및 간선 표현 그래프 선언
	static List<List<Integer>> graph = new ArrayList<>();
	
	//BFS 함수
	static void BFS(int start, int depth) {
		//활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//방문처리 및 초기값 넣어주기
		visited[start] = true;
		queue.offer(start);
		
		//정답배열의 초기값 갱신
		answer[start] = depth;
		
		
		//큐가 빌 때 까지
		while(!queue.isEmpty()) {
			
			//출력초과 방지용 for문
			for(int i=queue.size() ; i>0 ; i--) {
				//현재노드
				int now = queue.poll();
				
				//현재노드의 인접정점들
				for(int number : graph.get(now)) {
					//방문한 적이 없다면
					if(!visited[number]) {
						//큐에 넣어준 후 방문처리
						queue.offer(number);
						visited[number] = true;
						
						//정답배열의 값 넣어주기(후위연산자 안쓰게 주의)
						answer[number] = depth + 1;
					}
				}
			}
			
			//깊이 증가
			depth++;
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//정점의 수 N, 간선의 수 M, 시작 정점 R 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	R = Integer.parseInt(st.nextToken());
    	
    	//방문처리배열 및 정답배열 선언
    	visited = new boolean[N+1];
    	answer = new int[N+1];
    	
    	//정답배열 -1로 초기화
    	Arrays.fill(answer, -1);
    	
    	//그래프 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//간선정보 입력
    	while(M-->0) {
    		//정점 u, v 입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 표현
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//BFS함수 실행(시작노드, 깊이)
    	BFS(R, 0);
    	
    	//정답 출력
    	for(int i=1 ; i<=N ; i++) {
    		sb.append(answer[i]).append("\n");
    	}
    	
    	System.out.print(sb.toString());
    }
}	
