import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		//문자열 S 입력
		String S = br.readLine();
		
		//첫글자부터 탐색
		
		for(int i=0 ; i<S.length(); i++) {
			String str = "";
			
			//'<'인 경우
			if(S.charAt(i) == '<') {
				//큐 선언
				Queue<Character> queue = new LinkedList<>();
				
				//'>'가 나올때까지 탐색
				while(S.charAt(i) != '>') {
					queue.offer(S.charAt(i));
					i++;
				}
				
				//빠져나오면 마지막 '>'까지 추가
				queue.offer(S.charAt(i));
				
				//스택이 빌때까지 문자열에 추가
				while(!queue.isEmpty()) {
					str += queue.poll();
				}
			}else { //문자가 나온경우 
				
				if(S.charAt(i)==' ') { //빈칸일경우 빈칸 추가해준 후 continue
					sb.append(" ");
					continue;
				}
				
				//스택 선언
				Stack<Character> stack = new Stack<>();
				
				//공백이나 '<'가 나올때까지 혹은 문자열의 끝까지
				while(i<S.length() && S.charAt(i)!='<' && S.charAt(i)!=' ' ) {
					stack.push(S.charAt(i));
					i++;
				}
				
				//루프를 벗어나면 i 하나 줄여준 후 문자열 저장
				i--;
				
				while(!stack.isEmpty()) {
					str += stack.pop();
				}
			}
			
			sb.append(str);
		}
		
		System.out.println(sb);
    }
}	
