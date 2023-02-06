import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//스택 선언
		Stack<Integer> stack = new Stack<>();
		
		//테스트 케이스 개수 입력
		int N = Integer.parseInt(br.readLine()); 
		
		while(N != 0) {
			//BufferedReader는 한 줄 단위로 입력되기 때문에 토큰 사용
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(s.equals("pop")) {
				if(stack.isEmpty()) sb.append(-1 + "\n"); //비어있는 경우 -1 출력
				else {
					sb.append(stack.pop() + "\n"); //비어있지않은 경우 스택의 최상단 출력
				}
			}
			if(s.equals("size")) {
				sb.append(stack.size() + "\n"); //스택의 사이즈 출력 출력
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1 + "\n"); //비어있는 경우 1 출력
				}else {
					sb.append(0 + "\n"); //비어있는 경우 0 출력
				}
			}
			if(s.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1 + "\n"); //비어있는 경우 -1 출력
				}else {
					sb.append(stack.peek() + "\n");
				}
			}
			
			N--;
		}
		
		System.out.print(sb);
		
	}
	
}
