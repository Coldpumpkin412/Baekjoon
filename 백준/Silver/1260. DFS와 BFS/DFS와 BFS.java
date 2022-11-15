import java.util.*;


public class Main {
	public static int[][] edge = new int[1001][1001]; //간선
	public static boolean[] visited = new boolean[1001]; //방문상태
	public static int n; //정점개수
	public static int m; //간선개수
	public static int x; //시작정점

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		
		//간선 연결상태 저장
		for(int i=0 ; i<m ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			edge[x][y] = edge[y][x] = 1;
		}
		
		DFS(x);
		
		visited = new boolean[1001]; //방문상태 초기화
		System.out.println();
		
		BFS();
	}
	
	//DFS함수 정의
	//시작점 확인 후 방문처리, 다음 연결점을 시작점으로하여 재귀적호출
	public static void DFS(int start) {
		visited[start] = true; //방문처리
		System.out.print(start + " ");
		
		for(int i=1 ; i<=n ; i++) {
			if(edge[start][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	//BFS함수 정의
	//큐 자료구조 이용
	public static void BFS() {
		Queue<Integer> q = new LinkedList<Integer>(); //큐 자료구조는 연결리스트 활용
		q.offer(x); //시작점을 큐에 넣는다
		visited[x] = true;
		System.out.print(x + " ");
		
		while(!q.isEmpty()) { //큐가 빌때까지 반복
			//방문한 정점은 방문처리 및 출력
			int y = q.poll();
			for(int i=1 ; i<=n ; i++) {
				if(edge[y][i]==1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
		}
	}
}