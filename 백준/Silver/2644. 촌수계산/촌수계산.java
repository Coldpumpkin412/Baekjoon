import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] arr;
	static int[] answer;
	
	//BFS함수
	static void BFS(int start, int end) {
		//활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//초기값 넣어주기
		queue.offer(start);
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재 노드
			int now = queue.poll();
			
			//만약 현재 노드가 목표지점에 도달했다면
			if(now == end) {
				//종료
				break;
			}
			
			for(int i=1 ; i<=N ; i++) {
				//관계를 가지고 있으며 처음방문한 경우
				if(arr[now][i]==1 && answer[i]==0) {
					//촌수를 하나 늘려서 저장 후 해당 노드를 큐에 넣어주기
					answer[i] = answer[now]+1;
					queue.offer(i);
				}
			}
			
			
		}
	}
	
    public static void main(String[] args) throws IOException {
    	//BFS활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//전체 사람의 수 N 입력 및 관계저장 배열 선언
    	N = Integer.parseInt(br.readLine());
    	arr = new int[N+1][N+1];
    	
    	//확인해야하는 두 사람의 번호 입력
    	st = new StringTokenizer(br.readLine());
    	int start = Integer.parseInt(st.nextToken());
    	int end = Integer.parseInt(st.nextToken());
    	
    	//부모 자식들간의 관계의 개수 M 입력
    	int M = Integer.parseInt(br.readLine());
    	
    	//부모 자식간의 관계를 나타내는 번호 x, y 입력
    	while(M-->0) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		//처음 주어지는 관계는 1촌이므로 양방향으로 1 부여
    		arr[x][y] = 1;
    		arr[y][x] = 1;
    	}
    	
    	//부모 노드에 대한 자식노드의 촌수 저장배열 선언
    	answer = new int[N+1];
    	
    	//BFS함수 실행
    	BFS(start, end);
    	
    	//만약 도달지점에 대한 촌수가 0이라면 -1 출력, 아니라면 값 출력
    	System.out.println(answer[end]==0 ? -1 : answer[end]);
    	
    }
}	
