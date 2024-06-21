import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//활용할 두 스택 선언
        	Stack<Character> LeftStack = new Stack<>();
        	Stack<Character> RightStack = new Stack<>();
        	
        	//강산이 입력한 키 
        	String key = br.readLine();
        	
        	for(int i=0 ; i<key.length(); i++) {
        		char index = key.charAt(i);
        		
        		//'<'가 입력된 경우
        		if(index == '<') {
        			//leftstack이 비어있지 않다면
        			if(!LeftStack.isEmpty()) {
        				//pop시킨 것을 rightstack으로 이동
        				RightStack.push(LeftStack.pop());
        			}
        		}else if(index == '>') { //'>'가 입력된 경우
        			//rightstack이 비어있지 않다면
        			if(!RightStack.isEmpty()) {
        				//pop시킨 것을 leftstack으로 이동
        				LeftStack.push(RightStack.pop());
        			}
        		}else if(index == '-') { //'-'가 입력된 경우
        			//leftstack이 비어있지 않다면
        			if(!LeftStack.isEmpty()) {
        				//pop하여 제거
        				LeftStack.pop();
        			}
        		}else { // 그 아외의 경우(패스워드가 입력된)
        			LeftStack.push(index);
        		}
        	}
        	
        	//rightstack이 빌때까지
        	while(!RightStack.isEmpty()) {
        		LeftStack.push(RightStack.pop());
        	}
        	
        	//get함수 활용하여 패스워드 스트링빌더에 저장
        	for(int i=0 ; i<LeftStack.size() ; i++) {
        		sb.append(LeftStack.get(i));
        	}
        	
        	//개행
        	sb.append("\n");
    	}
    	
    	//결과 출력
    	System.out.println(sb.toString());
    }
}	
