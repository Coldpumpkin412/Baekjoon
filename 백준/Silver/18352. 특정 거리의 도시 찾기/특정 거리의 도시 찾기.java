import java.util.*;
import java.io.*;

public class Main {
	
	//도로상황을 나타내는 그래프 선언
	static List<List<Integer>> graph = new ArrayList<>();
	
	//방문처리배열 겸 거리배열
	static int[] visited;
	
	//BFS함수
	static void BFS(int start) {
		//활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//초기값 설정
		queue.offer(start);
		visited[start] = 0;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			int now = queue.poll();
			
			//인접노드에 대해
			for(int next : graph.get(now)) {
				//방문한적이 없는 노드라면
				if(visited[next] == -1) {
					//거리 저장 및 큐에 넣어주기
					visited[next] = visited[now]+1;
					
					queue.offer(next);
				}
			}
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//도시의 개수 N, 도로의 개수 M, 거리정보 K, 출발도시 번호 X 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	int X = Integer.parseInt(st.nextToken());
    	
    	//방문처리 및 거리배열 초기값 설정
    	visited = new int[N+1];
    	Arrays.fill(visited, -1);
    	
    	
    	//그래프 초기화
    	for(int i=0 ; i<=N ; i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	//도로 정보 입력
    	while(M-->0) {
    		//출발도시 및 도착도시 입력
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		
    		//단방향
    		graph.get(A).add(B);
    	}
    	
    	//BFS함수 실행
    	BFS(X);
    	
    	//방문배열의 값 중 K와 같은것들 저장
    	for(int i=0 ; i<=N ; i++) {
    		if(visited[i] == K) {
    			sb.append(i).append("\n");
    		}
    	}
    	
    	//스트링빌더가 비어있다면 최단거리 K인 도시가 존재하지않으므로 -1 출력
    	System.out.println((sb.length()==0) ? -1 : sb.toString());
    }
}	
