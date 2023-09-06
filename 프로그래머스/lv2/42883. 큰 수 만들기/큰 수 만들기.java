import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
		
		//스택 선언 및 초기값 넣어주기
		Stack<Character> stack = new Stack<>();
		stack.push(number.charAt(0));
		
		for(int i=1 ; i<number.length() ; i++) {
			//헤드값이 다음 숫자보다 큰 경우 스택에 추가 후 continue
			if(stack.peek() >= number.charAt(i)) {
				stack.push(number.charAt(i));
				continue;
			}
			
			//헤드값이 다음 들어갈 숫자보다 작다면 pop(횟수차감)
			while(!stack.isEmpty() && k!=0 && stack.peek()<number.charAt(i)) {
				stack.pop();
				k--;
			}
			
			stack.push(number.charAt(i));
			
		}
		
		//전부 다 돈 후 k가 0보다 크면 k만큼 pop
		while(k != 0) {
			stack.pop();
			k--;
		}
		
		//answer에 stack값 저장
		int size = stack.size();
		for(int i=0 ; i<size ; i++) {
			answer += stack.pop();
		}
		
		//문자열 뒤집기
		StringBuilder sb = new StringBuilder(answer).reverse();
		
		return sb.toString();
    }
}