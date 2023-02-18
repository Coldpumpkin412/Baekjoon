
import java.util.*;
import java.io.*;

public class Main {
	/*
	 * Deque(데크) : 큐의 양쪽에 데이터를 넣고 뺄 수 있는 형태의 자료구조를 의미한다.
	 * 큐와 스택을 합쳐놓은 형태
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//데크 선언
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		//입력할 문장의 개수
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			//공백을 기준으로 구분
			String[] str = br.readLine().split(" ");
			
			// 입력한 단어에 따른 명령어(스위치문 활용)
						switch (str[0]) {
			 
							case "push_front": {
								dq.addFirst(Integer.parseInt(str[1]));
								break;
							}
							
							case "push_back": {
								dq.addLast(Integer.parseInt(str[1]));
								break;
							}
			 
							case "pop_front": {
								if (dq.isEmpty()) {
									sb.append(-1).append('\n');
								} 
								else {
									sb.append(dq.pollFirst()).append('\n');
								}
								break;
							}
			 
							case "pop_back": {
								if (dq.isEmpty()) {
									sb.append(-1).append('\n');
								} 
								else {
									sb.append(dq.pollLast()).append('\n');
								}
								break;
							}
			 
							case "size": {
								sb.append(dq.size()).append('\n');
								break;
							}
			 
							case "empty": {
								if (dq.isEmpty()) {
									sb.append(1).append('\n');
								} 
								else {
									sb.append(0).append('\n');
								}
								break;
							}
			 
							case "front": {
								if (dq.isEmpty()) {
									sb.append(-1).append('\n');
								} 
								else {
									sb.append(dq.peekFirst()).append('\n');
								}
								break;
							}
			 
							case "back": {
								if (dq.isEmpty()) {
									sb.append(-1).append('\n');
								} 
								else {
									sb.append(dq.peekLast()).append('\n');
								}
								break;
							}
						}
					}
					System.out.println(sb);
				}
			}

	
