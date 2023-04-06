import java.util.*;
import java.io.*;

public class Main {
	static long A,B;
	static int count;
	
	//BFS함수
	public static int BFS() {
		//활용할 큐 선언
		Queue<Long> queue = new LinkedList<>();
		
		//초기값 넣어주기
		queue.offer(A);
		
		//큐가 빌때까지
		while(!queue.isEmpty()) {
		
			long size = queue.size();
			
			for(int i=0 ; i<size ; i++) {
				//현재노드
				long now = queue.poll();
				
				//찾고자하는 수가 맞다면 1더해준 후 출력
				if(now == B) return count+1;
				
				if(now*2 <= B) queue.offer(now*2);
				if(now*10+1 <= B) queue.offer(now*10 + 1);
			}
			
			count++;
		}
		//만들 수 없다면 -1 출력
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		
		System.out.println(BFS());
		
	}
}

	
