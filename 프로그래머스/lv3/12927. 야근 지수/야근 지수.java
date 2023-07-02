import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        /*
		 * 제곱수는 기준이되는 수가 커질수록 차이가 점점 커진다.
		 * ex) 99^2와 100^2 의 차이는 100을 넘음
		 * 즉 제곱수의 합을 최소화시키기 위해서는 최소값에 신경쓰기보다, 
		 * 최댓값의 값을 줄이는 데 집중한다
		 */
        
		long answer = 0;
		int sum = 0;
		
		//높은숫자가 우선인 우선순위 큐 선언
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		//큐에 works값 넣어주기
		for(int number : works) {
			pq.add(number);
			sum += number;
		}
		
		//남은 작업량의 합이 n보다 작거나 같으면 0출력
		if(sum<=n) return 0;
		
		//n이 0이 될때까지
		while(n != 0) {
			//pq에서 최댓값을 제거 후 -1한 숫자를 추가
			int num = pq.poll();
			
			pq.add(num-1);
			
			n--;
		}
		
		while(!pq.isEmpty()) {
			long index = pq.poll();
			
			answer += index*index;
		}
		
		return answer;
    }
}