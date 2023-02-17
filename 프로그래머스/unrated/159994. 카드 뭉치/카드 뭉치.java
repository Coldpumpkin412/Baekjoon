import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //두 개의 카드뭉치들을 각각의 큐에 순서대로 담기
		Queue<String> card1 = new LinkedList<>();
		Queue<String> card2 = new LinkedList<>();

		for(String str : cards1) card1.offer(str);
		for(String str : cards2) card2.offer(str);
		
		//goal배열의 첫 번째 값부터 확인
		for(String str : goal) {
			System.out.println(str);
			//goal의 문자열이 헤드값인 카드뭉치 큐를 poll
			if(card1.contains(str) && card1.peek().equals(str)) {
				card1.poll();
			}
			else if(card2.contains(str) && card2.peek().equals(str)) {
				card2.poll();
			}//아닌경우 No리턴
			else return "No";
		}
		
		return "Yes";
    }
}