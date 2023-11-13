import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	//문자열 입력
    	String str = br.readLine();
    	
    	//폭발문자열 입력
    	String bomb = br.readLine();
    	
    	//스택 선언
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i=0 ; i<str.length() ; i++) {
    		//문자열의 첫글자부터 순서대로 스택에 넣어주기
    		stack.push(str.charAt(i));
    		
    		//스택의 크기가 폭발문자열의 길이보다 크거나 같아지면
    		if(stack.size() >= bomb.length()) {    	
    			boolean check = true;
    			
    			//한글자씩 비교
    			for(int j=0; j<bomb.length() ; j++) {
    				//폭발문자열과 다른 문자열이 있는경우 체크변수 변경 후 break
    				if(stack.get(stack.size()-bomb.length()+j) != bomb.charAt(j)) {
    					check = false;
    					
    					break;
    				}
    			}
    			//체크가 true라면 폭발문자열이 존재하는것, 그 길이만큼 스택에서 빼주기
    			if(check) {
    				for(int j=0 ; j<bomb.length(); j++) {
    					stack.pop();
    				}
    			}
    		}
    	}
    	
    	//남은 스택의 값들을 문자열로 변경    	
    	for(Character ch : stack) {
    		sb.append(ch);
    	}
    	
    	//정답문자열이 비어있다면 FRULA를, 아니라면 answer를 출력
    	System.out.println(sb.toString()=="" ? "FRULA" : sb.toString());
    }
}	
