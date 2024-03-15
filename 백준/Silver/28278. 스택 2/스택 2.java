import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
        
        //시간초과 대비 스트링빌더 사용
    	StringBuilder sb = new StringBuilder();
    	
    	//활용할 스택 선언
    	Stack<String> stack = new Stack<>();
    	
    	//명령의 수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	while(N-->0) {
    		st = new StringTokenizer(br.readLine());
    		//명령어 입력
    		String command = st.nextToken();
    		
    		//1이 입력된 경우
    		if(command.equals("1")) {
    			//정수 X를 스택에 넣기
    			stack.push(st.nextToken());
    		}else if(command.equals("2")) { //2가 입력된 경우
    			//스택에 정수가 있다면 맨 위의 정수를 빼고 출력, 없다면 -1 출력
    			if(stack.isEmpty()) {
    				sb.append("-1").append("\n");
    			}else {
    				sb.append(stack.pop()).append("\n");
    			}
    		}else if(command.equals("3")) { //3이 입력된 경우
    			//스택에 들어있는 정수 개수 출력
    			sb.append(stack.size()).append("\n");
    		}else if(command.equals("4")) { //4가 입력된 경우
    			//스택이 비어있으면 1, 아니면 0 출력
    			if(stack.isEmpty()) {
    				sb.append("1").append("\n");
    			}else {
    				sb.append("0").append("\n");
    			}
    		}else {//5가 입력된 경우
    			//스택에 정수가 있다면 맨 위의 정수 출력, 없다면 -1 출력
    			if(stack.isEmpty()) {
    				sb.append("-1").append("\n");
    			}else {
    				sb.append(stack.peek()).append("\n");
    			}
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
