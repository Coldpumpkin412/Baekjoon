import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static boolean[] visited ;
	static int[] board;
	static int[] dice = {1,2,3,4,5,6};
	
	public static void main(String[] args) throws IOException{
		/*
		 * BFS활용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Queue<Integer> queue = new LinkedList<>();
		
		//사다리, 뱀 해시맵 선언(사다리와 뱀은 서로 겹치지않으므로 하나면 충분) 
		Map<Integer, Integer> map = new HashMap<>();
		
		//방문처리배열 및 보드 초기화
		visited = new boolean[101]; //전부 false로 초기화
		board = new int[101]; //전부 0으로 초기화
		
		//사다리의 수 N, 뱀의 수 M 입력
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//사다리 정보 입력
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map.put(x, y);
		}
		
		//뱀 정보 입력
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			map.put(u, v);
		}
		
		//초기값
		queue.offer(1);
		visited[1] = true;
		
		//큐가 빌 때 까지
		while(!queue.isEmpty()) {
			//현재노드
			int now = queue.poll();
			
			//주사위 눈금 6가지에 대한 다음 노드
			for(int i=0 ; i<6 ; i++) {
				int next = now + dice[i];

				//다음 노드가 사다리 혹은 뱀에 도착하는경우
				if(map.containsKey(next)) {
					next = map.get(next);
				}
				//다음 노드가 맵을 벗어났거나 방문한적이 있는경우
				if(next<0 || next>100 || visited[next]) {
					continue;
				}
				
				//이동횟수 1증가 후 넣기
				board[next] = board[now] + 1;
				
				//방문처리 및 큐에넣기
				visited[next] = true;
				queue.offer(next);
			}
		}
		
		System.out.println(board[100]);
	}
}

	
