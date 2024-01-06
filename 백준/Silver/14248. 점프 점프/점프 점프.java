import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//돌다리 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//돌다리 및 방문처리배열 선언
    	int[] bridge = new int[N];
    	boolean[] visited = new boolean[N];
    	
    	//돌다리 값(점프가능거리) 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		bridge[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//시작위치 입력 및 해당 위치 방문처리
    	int start = Integer.parseInt(br.readLine());
    	
    	//큐 선언
    	Queue<Integer> queue = new LinkedList<>();
    	
    	//초기값 부여 및 방문처리
    	queue.offer(start-1);
    	visited[start-1] = true;
    	
    	//방문할 수 있는 돌의 개수 초기값
    	int count = 1;
    	
    	while(!queue.isEmpty()) {
    		//점프가능 거리
    		int jump = bridge[queue.peek()];
    		
    		//앞으로 이동
    		int next_front = queue.peek()+jump;
    		
    		//맵을 벗어나지않고 방문한적이 없다면
    		if(next_front<N && !visited[next_front]) {
    			//방문처리 후 큐에 넣어주기
    			visited[next_front] = true;
    			queue.offer(next_front);
    			
    			count++;
    		}
    		
    		//뒤로 이동
    		int next_back = queue.peek()-jump;
    		
    		//맵을 벗어나지않고 방문한적이 없다면
    		if(next_back>=0 && !visited[next_back]) {
    			//방문처리 후 큐에 넣어주기
    			visited[next_back] = true;
    			queue.offer(next_back);
    			
    			count++;
    		}
    		
    		//헤드값 빼주기
    		queue.poll();
    	}
    	
    	System.out.print(count);
    }
}	
