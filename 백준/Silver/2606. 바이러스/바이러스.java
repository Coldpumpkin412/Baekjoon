import java.util.*;

public class Main {
	public static int N; //컴퓨터의 수
	public static int M; //컴퓨터쌍의 수
	public static int[][] graph = new int[101][101]; //간선 연결상태
	public static boolean[] visited = new boolean[101]; //방문처리
	public static int count = 0; //웜바이러스에 걸리게되는 컴퓨터의 수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		//2차원 배열로 간선연결상태 그래프 표현
		for(int i=0 ; i<M ; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			
			graph[node1][node2] = graph[node2][node1] = 1; //간선연결상태 저장
		}
		
		DFS(1);
		
		System.out.println(count-1);
	}
	
	//DFS함수
	public static void DFS(int start) {
		visited[start] = true; //방문처리
		count ++; //DFS가 한 번 실행될때마다 횟수를 늘려 바이러스가 걸린 컴퓨터의 수 확인
		
		for(int i=0 ; i<=N ; i++) {
			//노드가 연결돼있으며, 아직 방문처리가 되지 않은경우
			if(graph[start][i] == 1 && visited[i] == false) {
				DFS(i); //재귀적 호출 활용
			}
		}
	}

}