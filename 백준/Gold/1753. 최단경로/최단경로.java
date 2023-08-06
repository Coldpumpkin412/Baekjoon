import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
	private int index;
	private int distance;
	
	//생성자
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	//거리가 짧은게 더 높은 우선순위를 갖도록
	@Override
	public int compareTo(Node other) {
		if(this.distance<other.distance) {
			return -1;
		}
		
		return 1;
	}
}

public class Main {
	
	//초기값 부여시 활용할 변수
	public static final int INF = (int)1e9;
	
	//노드의 개수(V), 간선의 개수(E), 시작 노드 번호(K)
	public static int V, E, K;
	
	//노드 연결정보 저장리스트
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	
	//방문처리 배열
	public static boolean[] visited;
	
	//최단거리 테이블
	public static int[] map;
	
	//다익스트라 알고리즘
	public static void Dijkstra(int K) {
		//우선순위큐 활용을 위해 선언
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		//시작 노드로 가기위해 최단경로 0으로 설정 후 큐에 삽입
		pq.offer(new Node(K, 0));
		map[K] = 0;
		
		//큐가 빌때까지
		while(!pq.isEmpty()) {
			//최단거리가 가장 짧은 노드 정보 꺼내기(거리, 인덱스)
			Node node = pq.poll();			
			int dist = node.getDistance();
			int now = node.getIndex();
			
			//처리된적 있다면 무시
			if(map[now]<dist) {
				continue;
			}
			
			for(int i=0 ; i<graph.get(now).size() ; i++) {
				int cost = map[now]+graph.get(now).get(i).getDistance();
				
				//현재노드를 거쳐가는게 더 최단거리인 경우
				if(cost<map[graph.get(now).get(i).getIndex()]) {
					map[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
				}
			}
		}
		
	}
    public static void main(String[] args) throws IOException{
    	/*
    	 * 다익스트라 알고리즘 및 우선순위 큐 활용하여 최단거리 구하기
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//노드 개수 및 간선 개수 입력
    	st = new StringTokenizer(br.readLine());
    	V = Integer.parseInt(st.nextToken());
    	E = Integer.parseInt(st.nextToken());
    	
    	//시작정점 입력
    	K = Integer.parseInt(br.readLine());
    	
    	visited = new boolean[V+1];
    	map = new int[V+1];
    	
    	//그래프 초기화
    	for(int i=0 ; i<=V ; i++) {
    		graph.add(new ArrayList<Node>());
    	}
    	
    	//간선 정보 입력
    	while(E-->0) {
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		
    		//u번 노드 → v번 노드 거리 : w
    		graph.get(u).add(new Node(v, w));
    	}
    	
    	//최단거리테이블 모두 무한으로 초기화
    	Arrays.fill(map, INF);
    	
    	//다익스트라 메소드
    	Dijkstra(K);
    	
    	//시작노드 기준 모든 노드까지의 최단거리 출력
    	for(int i=1 ; i<=V ; i++) {
    		if(map[i] == INF) {//도달할 수 없는 경우 INF출력
    			System.out.println("INF");
    		}else {
    			System.out.println(map[i]);
    		}
    	}
    	
    }
}	
