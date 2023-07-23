import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
		
        //큐 선언 및 값 넣어주기
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1 ; i<=N ; i++) {
			queue.offer(i);
		}		
		
        //큐가 빌 때까지
		while(!queue.isEmpty()) {
			sb.append(queue.poll()).append(" ");

			if(queue.isEmpty()) {
				break;
			}
            
            //출력값 다시 넣어주기
			queue.offer(queue.poll());
		}
		
		System.out.println(sb.toString());
	}
}