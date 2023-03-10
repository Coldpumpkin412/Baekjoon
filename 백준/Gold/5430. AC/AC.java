import java.util.*;
import java.io.*;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	
	//TC 첫줄에 입력될 함수p를 실행할 메소드
	public static void command(String p, ArrayDeque<Integer> deq) {
		
		boolean check = true;
		
		//입력된 p 한 글자씩 받아오기
		for(char ch : p.toCharArray()) {
			//R인경우 check를 반대로 뒤집어주기
			if(ch == 'R') {
				check = !check;
				continue;
			}
			//D인경우
			if(ch == 'D') {
				if(deq.isEmpty()) { //비어있다면 에러 표시 후 종료
					sb.append("error").append("\n");
					return;
				}else {
					if(check) { //check가 true인 경우 앞에서부터 버리기
						deq.pollFirst();
					}else { //check가 false인 경우 뒤에서부터 버리기
						deq.pollLast();
					}
				}
			}
		}
		
		//데크에 남아있는 값들로 정답 출력
		answer(deq, check);
	}
	
	public static void answer(ArrayDeque<Integer> deq, boolean check) {
		sb.append('[');
		
		if(deq.size()>0) { //데크에 값이 있는경우
			//check가 true라면 정방향으로 출력
			if(check) {
				sb.append(deq.pollFirst());
				
				while(!deq.isEmpty()) {
					sb.append(',').append(deq.pollFirst());
				}
			}else {//check가 false라면 역방향으로 출력
				sb.append(deq.pollLast());
				
				while(!deq.isEmpty()) {
					sb.append(',').append(deq.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}
	public static void main(String[] args) throws IOException{
		/*
		 * Deque(데크) 활용하여 풀기.
		 * 데크는 큐의 성질과 스택의 성질을 동시에 사용할 수 있어, 앞 뒤 어느쪽으로든 값을 입출력 가능
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			ArrayDeque<Integer> deq = new ArrayDeque<>();
			
			//수행할 함수 p 입력
			String p = br.readLine();
			
			//배열에 들어갈 수의 개수 n 입력
			int n = Integer.parseInt(br.readLine());
			
			//배열 형태로 정수 입력('[', ']', ','를 구분자로 넣어준다)
			st = new StringTokenizer(br.readLine(), "[],");
			for(int i=0 ; i<n ; i++) {
				//구분자로 구분된정수들은 데크에 넣어주기
				deq.add(Integer.parseInt(st.nextToken()));
			}
			
			//함수 command 실행
			command(p, deq);
		}	
		//결과값 출력
		System.out.println(sb);
	}
}

	
