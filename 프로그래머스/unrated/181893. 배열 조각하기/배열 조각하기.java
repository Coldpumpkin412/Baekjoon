import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0 ; i<arr.length ; i++) {
			deque.offer(arr[i]);
		}
		
		for(int i=0 ; i<query.length ; i++) {
			int index = query[i];
			
			int start = 0;
			int end = deque.size()-1;
			if(i%2==0) {
				//짝수 인덱스 : query[i]번 인덱스 뒷부분 다 버리기
				while(deque.size() != index+1) {
					deque.removeLast();
				}
			}else {
				//홀수 인덱스 : query[i]번 인덱스 앞부분 다 버리기
				for(int j=0 ; j<index ; j++) {
					deque.removeFirst();
				}
			}
		}
        
		int[] answer = new int[deque.size()];
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = deque.pollFirst();
		}
		
		return answer;
    }
}