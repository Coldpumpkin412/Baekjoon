import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	        
    	//음악 수 N ,프렛 수 P 입력 
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int P = Integer.parseInt(st.nextToken());
    	
    	//활용할 스택 배열 선언
    	Stack<Integer>[] stack = new Stack[7];
    	
    	//스택 초기화
    	for(int i=1 ; i<7 ; i++) {
    		stack[i] = new Stack<Integer>();
    	}
    	
    	int answer = 0;
    	
    	for(int i=0 ; i<N ; i++) {
    		
    		//줄의 번호 L, 프렛 번호 F 입력
    		st = new StringTokenizer(br.readLine());
    		int L = Integer.parseInt(st.nextToken());
    		int F = Integer.parseInt(st.nextToken());
    		
    		while(!stack[L].isEmpty()) {
    			
    			//입력받은 프렛이 더 큰 경우
    			if(stack[L].peek() < F) {
    				//스택에 넣어주기
    				stack[L].push(F);
    			}else if(stack[L].peek() > F) { //입력받은 프렛이 더 작은 경우
    				//스택에서 제거
    				stack[L].pop();
    			}else {
    				break;
    			}
    			
    			answer += 1;
    		}
    		
    		//스택이 비어있는 경우
    		if(stack[L].isEmpty()) {
    			//스택에 넣어주기
    			stack[L].push(F);
    			
    			answer += 1;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
