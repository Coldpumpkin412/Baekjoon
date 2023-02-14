import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer=0;
        
		//우선순위 큐 생성 후 값 추가(기본적으로 헤드값이 오름차순으로 나오게 된다)
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i : scoville) pq.add(i);
		
		while(true) {
            //큐의 값이 하나밖에 남지 않고, 스코빌지수가 K보다 낮은경우
			if(pq.peek()<K && pq.size()==1) {
				return -1;
			}
            else if(pq.peek() >= K) {//제일 작은 숫자가 K보다 큰 경우 
				break;
			}
            else {//K보다 낮은 스코빌 지수의 숫자가 있는 경우
				answer++;
				
				int first = pq.poll();
				int second = pq.poll();
				
				pq.add(first + second * 2);
			}
		}
		
		return answer;
    }
}