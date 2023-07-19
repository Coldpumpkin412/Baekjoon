import java.util.*;
import java.io.*;

public class Main {
	//위치저장변수
	static int N, K;
	
	//방문처리배열
	static boolean[] visited = new boolean[100001];
	
	//정답변수(최소비용을 찾기위해 초기값으로는 max_value선언
	static int answer = Integer.MAX_VALUE;
	
	//노드클래스 선언
	static class Node{
		int position;
		int time;
		
		//생성자
		Node(int position, int time){
			this.position = position;
			this.time = time;
		}
	}
	
	//BFS함수
	static void BFS() {
		//BFS용 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//큐 및 방문처리배열 초기값 설정
		queue.offer(new Node(N, 0));
		
		while(!queue.isEmpty()) {
			//현재노드
			Node now = queue.poll();
			//방문처리
			visited[now.position] = true;
			
			//위치가 동생과 같다면 정답 갱신
			if(now.position == K) {
				answer = Math.min(answer, now.time);
			}
			
			//수빈의 위치이동에 따라 시간 조정 및 큐에 값 넣어주기
			if(now.position*2<=100000 && !visited[now.position*2]) {//순간이동한 경우
				queue.offer(new Node(now.position*2, now.time));
			}
			if(now.position+1<=100000 && !visited[now.position+1]) {//앞으로 한 칸 이동한 경우
				queue.offer(new Node(now.position+1, now.time+1));
			}
			if(now.position-1>=0 && !visited[now.position-1]) { //왼 쪽으로 한 칸 이동한 경우
				queue.offer(new Node(now.position-1, now.time+1));
			}
		}
	}
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * BFS활용하여 풀기
    	 * 단순히 목적지에 도달했을때 함수에서 나오는게 아닌,
    	 * 모든 경우를 다 확인 후 가장 최소비용을 출력하는게 포인트. 
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//수빈이와 동생의 위치 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//BFS함수 실행
    	BFS();
    	
    	//정답출력
    	System.out.println(answer);
    }
}	
