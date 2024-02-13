import java.util.*;
import java.io.*;

public class Main {
	//간선 그래프 선언
	static List<List<Integer>> graph = new ArrayList<>();
	
	//방문처리 배열
	static boolean[] visited;
	
	//정답배열
	static int[] answer;
	
	//BFS함수
	static void BFS(int start) {
		int count = 1;
		
		//활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//초기값 부여 및 방문처리
		queue.offer(start);
		visited[start] = true;
		
		//결과값 저장
		answer[start] = count++;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			int now = queue.poll();
			
			//현재노드의 인접한 노드
			for(int i=0 ; i<graph.get(now).size() ; i++) {
				//다음 노드
				int next = graph.get(now).get(i);
				
				//방문한 적이 없는 노드라면
				if(!visited[next]) {
					//방문처리 후 큐에 넣어주기
					visited[next] = true;
					queue.offer(next);
					
					//결과값 저장
					answer[next] = count++;
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정점의 수 N, 간선의 수 M, 시작 정점 R 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int R = Integer.parseInt(st.nextToken());
    	
    	visited = new boolean[N+1];
    	answer = new int[N+1];
    	
    	//그래프 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//간선 정보 u, v 입력
    	while(M-->0) {
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		//양방향 간선 나타내기
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	//그래프 내림차순 정렬
    	for(int i=0 ; i<=N ; i++) {
    		Collections.sort(graph.get(i), Collections.reverseOrder());
    	}
    	
    	//BFS함수
    	BFS(R);
    	
    	//결과값 출력
    	for(int i=1 ; i<=N ; i++) {
    		System.out.println(answer[i]);
    	}
    }
}	
