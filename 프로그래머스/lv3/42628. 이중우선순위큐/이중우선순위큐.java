import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        /*
		 * I 숫자 : 큐에 주ㅜ어진 숫자 삽입
		 * D 1 : 큐에서 최댓값 삭제
		 * D -1 : 큐에서 최솟값 삭제
		 * 
		 * 모든 연산을 처리한 후 큐가 비어있으면 {0,0}을, 비어있지않으면 {최댓값, 최솟값} return
		 */
		
		//높은숫자가 우선인 큐와 낮은숫자가 우선인 큐 두 개 선언
		PriorityQueue<Integer> LQueue = new PriorityQueue<>();
		PriorityQueue<Integer> HQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0 ; i<operations.length ; i++) {
			String[] str = operations[i].split(" ");
			
			int number = Integer.parseInt(str[1]);
			
			//I인 경우 두 큐에 모두 삽입
			if(str[0].equals("I")) {
				LQueue.add(number);
				HQueue.add(number);
			}else if(str[0].equals("D") && number==1){ //최댓값 삭제
				if(HQueue.isEmpty()) continue;
				
				number = HQueue.poll();
				LQueue.remove(number);
			}else if(str[0].equals("D") && number==-1) {//최솟값 삭제
				if(LQueue.isEmpty()) continue;
				
				number = LQueue.poll();
				HQueue.remove(number);
			}
		}
		
		int[] answer = new int[2];
		
		if(LQueue.isEmpty()) {
			answer[0] = 0;
			answer[1] = 0;
		}else {
			answer[0] = HQueue.peek();
			answer[1] = LQueue.peek();
		}
		
		System.out.println(answer[0] + " " + answer[1]);
		return answer;
    }
}