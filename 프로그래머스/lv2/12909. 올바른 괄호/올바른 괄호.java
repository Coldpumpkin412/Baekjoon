import java.util.*;

class Solution {
	boolean solution(String s) {
		/*
		 * 1.스택 활용.
		 * '('을 만날시 스택에 추가, ')'을 만날시 스택에서 제거
		 * 문자열끝까지 실행후 스택이 비어있으면 true 아니면 false
		 * 
		 * 2.문자열이 ')'로 시작되면 false
		 */
		Stack<Character> stack = new Stack<>();
		
		if(s.charAt(0)==')') return false;
		
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) == '(') stack.push('(');
			else {
				if(!stack.isEmpty()) stack.pop();
			}
		}
		
		if(stack.size() == 0) return true;
		else return false;
		
	}
}