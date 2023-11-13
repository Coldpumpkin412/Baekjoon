import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
		
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		//원서가 10^9이하이므로 합은 long을 선언
		long total = 0;
		long queue1_sum = 0;
		
		//주어진 배열들을 각각의 큐에 넣어주면서 첫번째 배열의 합 및 두 배열의 합 값을 구한다
		for(int i=0 ; i<queue1.length ; i++) {
			q1.offer(queue1[i]);
			q2.offer(queue2[i]);
			
			total += queue1[i]+queue2[i];
			queue1_sum += queue1[i];
		}
		
		//두 배열의 합이 홀수라면 같게만들 수없으므로 -1 출력
		if(total%2 == 1) {
			return -1;
		}
		
		//두 배열의 합/2 가 타겟이 된다
		long target = total/2;
		
		//두 배열 각각의 합을 구한 후 타겟보다 큰 쪽에서 poll 후 작은 쪽에 push해준다
		while(true) {
			//연산횟수가 두 배열의 길이합*2를 넘으면 불가능한것이므로 -1 리턴
			if(answer > (queue1.length + queue2.length)*2) {
				return -1;
			}
			
			//타겟과 큐1의 합이 같아지면 빠져나오기
			if(target == queue1_sum) {
				break;
			}else if(queue1_sum > target) {
				q2.offer(q1.peek());
				queue1_sum -= q1.poll(); 
			}else {
				q1.offer(q2.peek());
				queue1_sum += q2.poll();
			}
			
			answer++;
		}
		
		
		return answer;
    }
}