import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
		int[] answer = new int[2];
		
		//활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//누적값 변수 선언
		int sum = 0;
		
		//부분수열의 길이 및 시작인덱스 저장변수 선언
		int length = Integer.MAX_VALUE;
		int start_index = 0;
		
		for(int i=0 ; i<sequence.length ; i++) {
			//큐에 차례대로 배열값 넣어주고 누적합 최신화
			queue.offer(sequence[i]);
			
			sum += sequence[i];
			
			//sum이 k이고 큐의 길이가 이전 부분수열길이보다 작은 경우
			if(sum==k && queue.size()<length) {
				//끝인덱스 및 부분수열 길이 최신화
				answer[0] = start_index;
				answer[1] = i;
				length = queue.size();
			}else if(sum>k) { //sum이 k보다 크다면
				//sum이 k보다 작거나 같아질때까지
				while(sum>k) {
					//큐의 헤드값을 누적값에서 제거
					sum -= queue.poll();
					
					//시작인덱스 증가
					start_index++;
				}
				
				//루프문 빠져나왔을때 sum이 k와 같다면
				if(sum==k && queue.size()<length) {
					//시작, 끝인덱스 및 부분수열 길이 최신화
					answer[0] = start_index;
					answer[1] = i;
					length = queue.size();
				}
				
			}
			
		}
		
		return answer;
    }
}