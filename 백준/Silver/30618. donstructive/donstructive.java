import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        //순열 길이 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//수열 저장 데크 선언
		Deque<Integer> queue = new LinkedList<>();
        
		boolean check = false; 
		
		for(int i=N ; i>=1; i--) {
			if(!check) {
				queue.addLast(i);
			}else {
				queue.addFirst(i);
			}
			
			check = !check;
		}
		
		while(!queue.isEmpty()) {
			sb.append(queue.poll()).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}
