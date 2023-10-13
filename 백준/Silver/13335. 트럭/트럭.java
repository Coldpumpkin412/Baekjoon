import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//다리를 표현할 큐 선언
    	Queue<Integer> bridge = new LinkedList<>();
    	
    	//트럭의 개수 N, 다리길이 W, 다리 최대하중 L 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int W = Integer.parseInt(st.nextToken());
    	int L = Integer.parseInt(st.nextToken());
    	
    	//트럭 무게 배열 선언
    	int[] truck_weight = new int[N];
    	    	
    	//트럭의 무게 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {    		
    		truck_weight[i] = Integer.parseInt(st.nextToken()); 
    	}
    	
    	//누적시간 및 누적중량 변수
    	int sum_time = 0;
    	int sum_weight = 0;
    	
    	//트럭 순서대로
    	for(int truck : truck_weight) {
    		while(true) {
    			//다리가 비어있는 경우
    			if(bridge.isEmpty()) {
    				//트럭을 다리 큐에 넣어준 후 누적시간 및 누적중량 최신화
    				bridge.offer(truck);
    				
    				sum_time++;
    				sum_weight += truck;
    				
    				break;
    			}else if(bridge.size() == W){//다리길이와 큐의 길이가 같은경우(꽉 차있는 경우)    				
    				//맨 앞의 트럭 빼주고 누적중량 최신화
    				sum_weight -= bridge.poll();
    			}else {//다리길이만큼 트럭이 올라와있지않은경우
    				//다음 트럭까지 포함한 중량이 최대하중을 넘지 않는경우
    				if(sum_weight+truck <= L) {
    					//큐에 넣어준 후 누적시간 및 누적중량 최신화
    					bridge.offer(truck);
    					
    					sum_time++;
    					sum_weight += truck;
    					
    					break;
    				}else {//다음 트럭까지 포함한 중량이 최대하중을 넘는경우
    					//0을 넣어 이미 들어와 있는 트럭을 앞으로 밀어준다
    					bridge.offer(0);
    					sum_time++;
    				}
    			}
    		}
    	}
    	
    	//끝나고 난 뒤 남은 마지막 트럭은 다리길이만큼 소요
    	System.out.println(sum_time + W);
    }
}	
