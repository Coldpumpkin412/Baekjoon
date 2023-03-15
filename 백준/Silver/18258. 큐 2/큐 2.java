import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//Deque 선언
		Deque<Integer> deq = new ArrayDeque<>();
		
		//명령의 수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			switch(str) {
				case "push" : deq.add(Integer.parseInt(st.nextToken())); break;
				case "pop" : if(deq.isEmpty()) {
								sb.append("-1\n");
								break;
							 }else {
								 sb.append(deq.pollFirst()).append("\n");
								 break;
							 }
				case "size" : sb.append(deq.size()).append("\n"); break;
				case "empty" : if(deq.isEmpty()) {
								sb.append("1\n");
								break;
							 }else {
								sb.append("0\n");
								break;
							 }
				case "front" : if(deq.isEmpty()) {
								sb.append("-1\n");
								break;
				 			 }else {
				 				sb.append(deq.peek()).append("\n");
				 				break;
				 			 }
				case "back" : if(deq.isEmpty()) {
								sb.append("-1\n");
								break;
				 			 }else {
				 				sb.append(deq.peekLast()).append("\n");
				 				break;
				 			 }
			}
		}
		System.out.println(sb);
	}
}

	
