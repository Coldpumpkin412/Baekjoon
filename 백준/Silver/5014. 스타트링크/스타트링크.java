import java.util.*;
import java.io.*;


public class Main {
	static int F, S, G, U, D;
	static int[] building;
	
	//BFS함수
	static void BFS(int start, int end) {
		//큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//초기값 입력
		queue.offer(start);
		building[start] = 1;
		
		//큐가 빌 때 까지
		while(!queue.isEmpty()) {
			//현재 층
			int now = queue.poll();
			
			//현재 층이 도착점이라면 출력 후 종료
			if(now == end) {
				System.out.println(building[now] - 1);
				return;
			}
			
			//위로 올라갈 때 꼭대기(F)보다 낮거나 같고 방문한적이 없는 경우
			if(now+U<=F && building[now+U]==0) {
				//이동횟수 증가 후 넣어주기
				building[now+U] = building[now] + 1;
				
				//큐에 넣어주기
				queue.offer(now + U);
			}
			
			//아래로 내려갈 때 1층보다 높거나 같고 방문한적이 없는 경우
			if(1<=now-D && building[now-D]==0) {
				//이동횟수 증가 후 넣어주기
				building[now-D] = building[now] + 1;
				
				//큐에 넣어주기
				queue.offer(now - D);
			}
		}
		
		//도달하지 못한 경우
		System.out.println("use the stairs");
		return;
	}
	
    public static void main(String[] args) throws IOException {
    	//BFS활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//건물 층 수F, 지금 위치S, 스타트링크 위치G, 위로 가는 층U, 아래로 가는 층D 입력
    	st = new StringTokenizer(br.readLine());
    	F = Integer.parseInt(st.nextToken());
    	S = Integer.parseInt(st.nextToken());
    	G = Integer.parseInt(st.nextToken());
    	U = Integer.parseInt(st.nextToken());
    	D = Integer.parseInt(st.nextToken());
    	
    	//건물 배열 입력
    	building = new int[F+1];
    	
    	//BFS함수
    	BFS(S, G);
    	
    }
}	
