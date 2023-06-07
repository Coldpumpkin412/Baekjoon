import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        /*
		 * 배열의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중 가장 크면서 
		 * 가장 가까이 있는 수를 담고, 없으면 -1을 담기
		 */
		
		//활용할 스택 선언
	    Stack<Integer> stack = new Stack<>();

	    // 정답 배열 생성
	    int[] answer = new int[numbers.length];

	    //초기값 스택에 넣어주기
	    stack.push(0);

	    
	    for (int i=1 ; i<numbers.length ; i++) {
	        //스택이 비어있지 않고, 스택의 헤드값보다 number의 값이 큰 경우
	        while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
	            //뒤에 있는 큰 수에 해당하는 모든 값 pop
	            answer[stack.pop()] = numbers[i];
	        }
	        
	        //현재 인덱스 값 넣어주기
	        stack.push(i);
	    }
	    
	    //뒤에있는 큰 수가 없는경우 -1
	    while (!stack.isEmpty()) {
	        answer[stack.pop()] = -1;
	    }

	    return answer;
    }
}