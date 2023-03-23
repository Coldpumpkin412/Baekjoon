import java.util.*;
import java.io.*;

public class Main {
	static int A,B; //A,B는 10,000 미만
	
	public static void main(String[] args) throws IOException{
		/*
		 * BFS 활용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			//A,B입력
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			

			//BFS에 활용할 큐, 방문처리용 배열, 정답배열 선언
			Queue<Integer> queue = new LinkedList<>();
			boolean[] visited = new boolean[10000];
			String[] answer = new String[10000];
			//정답배열 초기화
			Arrays.fill(answer, "");
			
			//초기값 큐에넣기 및 방문처리
			queue.offer(A);
			visited[A] = true;
			
			//큐가 비거나 B에 도달하지 않은경우
			while(!queue.isEmpty() && !visited[B]) {
				//현재 노드는 큐의 헤드값
				int now = queue.poll();
				
				//L,R에 활용할 첫단어 및 마지막 단어
				String first = Integer.toString(now).substring(0,1);
				String last = Integer.toString(now % 10);
				
				//DSLR 각각의 명령어 실행
				int D = (now * 2) % 10000;
				int S = (now == 0) ? 9999 : now - 1;
				int L = (now % 1000) * 10 + now / 1000; 
                int R = (now % 10) * 1000 + now / 10;
				
				if(!visited[D]) { //방문한적이 없다면
					//큐에 넣은 후 방문처리
					queue.offer(D);
					visited[D] = true;
					
					//정답배열에 명령어 추가
					answer[D] = answer[now] + "D";
				}
				
				if(!visited[S]) { //방문한적이 없다면
					//큐에 넣은 후 방문처리
					queue.offer(S);
					visited[S] = true;
					
					//정답배열에 명령어 추가
					answer[S] = answer[now] + "S";
				}
				
				if(!visited[L]) { //방문한적이 없다면
					//큐에 넣은 후 방문처리
					queue.offer(L);
					visited[L] = true;
					
					//정답배열에 명령어 추가
					answer[L] = answer[now] + "L";
				}
				
				if(!visited[R]) { //방문한적이 없다면
					//큐에 넣은 후 방문처리
					queue.offer(R);
					visited[R] = true;
					
					//정답배열에 명령어 추가
					answer[R] = answer[now] + "R";
				}
			}
			
			System.out.println(answer[B]);
		}
	}
}

	
