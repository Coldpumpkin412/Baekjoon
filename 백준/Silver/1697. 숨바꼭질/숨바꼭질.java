import java.util.*;
import java.io.*;


public class Main {
	//수빈의 위치
	static int N;
	//동생의 위치
	static int K;
	
	//방문처리용 배열(위치가 최대 100,000이므로 100,001까지 선언)
	//인덱스에 대한 값이 해당 위치까지 걸리는 시간이므로 int형으로 선언
	static int[] visited = new int[100001]; 
	
	static void BFS(int start) {
		//BFS에 활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//탐색 시작노드 큐에 삽입
		queue.add(start);
		//탐색 시작노드 방문처리(여기서는 시간개념이기 때문에 처음인 1초로 선언)
		visited[start] = 1;
		
		//큐가 빌때까지
		while(!queue.isEmpty()) {
			//큐의 헤드(노드)를 꺼내주기 
			int node = queue.poll();
			
			//해당 노드의 인접한 값들을 최신화
			for(int i=0 ; i<3 ; i++) {
				int next;
				
				if(i==0) { //이동방법 1번째, 현재위치+1
					next = node + 1;
				}else if(i==1) { //이동방법 2번째, 현재위치-1
					next = node - 1;
				}else { //이동방법 3번째, 현재위치x2
					next = 2 * node;
				}
				
				if(next == K) { //동생위치에 도달한 경우
					System.out.println(visited[node]);
					return;
				}
				
				//다음 인덱스(next)가 방문한적이 없고(visited[next]==0), 방문처리 배열 내 범위일때
				if(0<=next && next<visited.length && visited[next]==0) {
					//큐에 넣어준 후
					queue.add(next);
					
					//해당 인덱스의 배열값(걸린시간) 최신화
					visited[next] = visited[node] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * BFS를 활용하여 풀기
		 */
		Scanner sc = new Scanner(System.in);
		
		//수빈과 동생의 현재위치 입력
		N = sc.nextInt();
		K = sc.nextInt();
		
		if(N==K) {
			System.out.println("0");
			return;
		}else {
			BFS(N);
		}
	}
}

	
