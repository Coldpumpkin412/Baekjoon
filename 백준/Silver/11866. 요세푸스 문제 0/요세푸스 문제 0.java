import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		//사람의 수(N) 및 주기(K)입력
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	
		//1부터 N까지의 사람 큐에 넣어주기
		for(int i=1 ; i<=N ; i++) queue.offer(i);
		
		
		sb.append("<");
		//큐에 값이 하나가 남을때까지 반복
		while(queue.size()>1) {
			//주기가 오기전까지 맨 앞의 값을 뒤로 보내준다
			for(int i=0 ; i<K-1 ; i++) queue.offer(queue.poll());
			
			//주기가 오면 헤드값을 출력 후 스트링빌더에 저장(콤마 및 공백까지)
			sb.append(queue.poll()).append(", ");
		}
		//마지막 값은 따로 저장 후 꺽쇠까지 추가
		sb.append(queue.poll()).append(">");


		System.out.print(sb);
	}
}

	
