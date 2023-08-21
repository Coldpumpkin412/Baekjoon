import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //큐를 활용하여 풀기
		Queue<Integer> bridge = new LinkedList<>();
		
		//누적 시간 및 누적 중량 변수선언
		int sum_time = 0;
		int sum_weight = 0;
		
		for(int truck : truck_weights) {
			while(true) {
				//다리위에 트럭이 없는경우
				if(bridge.isEmpty()) {
					//트럭을 다리위에 올리고 중량 및 시간 갱신
					bridge.offer(truck);
					sum_time++;
					sum_weight += truck;
					
					break;
				}else if(bridge.size() == bridge_length) {//큐에 bridge_length만큼 트럭이 다 차있는경우
					//큐 맨 앞의 트럭을 빼주며 중량 갱신(다리를 건널 땐 시간 소요X)
					sum_weight -= bridge.poll();
				}else {//큐에 bridge_length만큼 트럭이 차있지 않은경우
					//다음트럭까지 포함한 누적중량이 weight을 넘지않는다면 큐에 넣어주기
					if(sum_weight+truck<=weight) {
						bridge.offer(truck);
						sum_time++;
						sum_weight += truck;
						
						break;
					}else{
						//넘는다면 0을 넣어주기(이미 큐에있는 트럭을 앞으로 보내는 형식)
						bridge.offer(0);
						sum_time++;
					}
				}
			}
		}
		
		//맨 마지막에 남은 트럭은 다리길이만큼 소요
		return sum_time + bridge_length;
    }
}