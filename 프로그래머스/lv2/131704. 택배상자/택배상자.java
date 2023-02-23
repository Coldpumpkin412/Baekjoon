import java.util.*;

class Solution {
    public int solution(int[] order) {
        //트럭에 실을 상자들 저장할 리스트 선언
		List<Integer> answer = new ArrayList<>(); 
		//임시로 보관할 스택 선언
		Stack<Integer> stack = new Stack<>();
		
		int index = 0; //order 배열의 인덱스 확인용
		int count = 1; //컨베이어 벨트에서 나오는 상자
		
		while(index < order.length) {
			//count가 order[index]인 경우 정답리스트에 저장 후 index증가 및 count증가
			if(count == order[index]) {
				answer.add(count);
				index++;
				count++;
			}//스택의 헤드가 order[index]인 경우
			else if(!stack.isEmpty() && stack.peek()==order[index]) {
				answer.add(order[index]);
				stack.pop();
				index++;
			}//스택의 헤드가 order[index]보다 크고 count가 order[index]보다 큰 경우
			else if(!stack.isEmpty() && stack.peek() > order[index] && count > order[index]) {
				break;
			}
			//count가 order[index]보다 작으면 스택에 추가
			else if(count < order[index]) {
				stack.add(count);
				count++;
			}
		}
		return answer.size();
    }
}