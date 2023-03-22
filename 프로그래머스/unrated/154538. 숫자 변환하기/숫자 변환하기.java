import java.util.*;

class Solution {
    //해당 인덱스까지 걸리는 시간을 저장할 배열(기존의 방문처리 배열과 같은 개념)
	static int[] time = new int[1000001];
    
    public int solution(int x, int y, int n) {
        /*
		 * BFS활용하여 풀기
		 */
		int answer=0;
		
		//BFS에 활용할 큐 선언
		Queue<Integer> queue = new LinkedList<>();
		
		//초기시간 선언
		time[x] = 0;
		//큐에 초기값 넣기
		queue.offer(x);
		
		//큐가 빌때까지 실행
		while(!queue.isEmpty()) {
			//큐의 헤드를 현재값으로 넣기
			int now = queue.poll();
			
			//현재값에서 이동할 수 있는 경우의 수 3가지(n더하기, 곱하기2, 곱하기3)
			for(int i=0 ; i<3 ; i++) {
				
				//다음 값 선언
				int next;
				
				if(i==0) {
					next = now + n;
				}else if(i==1) {
					next = now * 2;
				}else {
					next = now * 3;
				}
				
				//도착한 경우
				if(next == y) {
					return time[now]+1;
					
				}
				
				//방문한 적이 없는 인덱스에 도달한 경우
				if(0<=next && next<y && time[next]==0) {
					//큐에 넣어주기
					queue.offer(next);
					
					//해당 인덱스까지 도달한 시간 최신화
					time[next] = time[now] + 1;
				}
			}
		}
		
		if(x==y) return 0;
		
		//y에 도달하지 못하는 경우
		if(answer == 0) answer = -1;
		
		return answer;
    }
}