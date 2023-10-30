import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//아이들 및 거점지 방문 횟수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//선물 우선순위큐 선언(내림차순)
    	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    	
    	while(N-->0) {
    		st = new StringTokenizer(br.readLine());
    		
    		//선물 개수 A 입력
    		int A = Integer.parseInt(st.nextToken());
    		
    		//A가 0인경우
    		if(A == 0) {
    			//우선순위 큐가 비어있다면
    			if(pq.isEmpty()) {
    				sb.append(-1).append("\n");
    			}else {
    				//리스트가 비어있지 않다면 맨 끝의 값어치(제일 큰 값) 저장 후 삭제
    				sb.append(pq.poll()).append("\n");
    			}
    		}else {
    			//0이 아닌경우 A만큼 선물 값어치 넣어주기
    			for(int i=0 ; i<A ; i++) {
    				pq.offer(Integer.parseInt(st.nextToken()));
    			}
    		}
    	}
    	
    	System.out.println(sb);
    }
}	
