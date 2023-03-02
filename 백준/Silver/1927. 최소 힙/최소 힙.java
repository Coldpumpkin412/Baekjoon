import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 우선순위 큐를 활용하여 풀기
		 * 기본적으로 큐는 FIFO(선입선출)의 방식을 띄지만, 
		 * 우선순위 큐는 더 높은 우선순위를 갖는 값을 헤드값으로 한다.
		 * 
		 * 낮은 숫자를 높은 우선순위로 갖는 우선순위 큐를 활용하여 풀어보기.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//기본적으로 낮은 숫자가 우선순위를 갖는다.(높은 숫자를 원할 경우 Collections.ReverseOrder 필요)
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//연산의 개수 N입력
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			//입력값의 범위가 2^31보다 작은 자연수기 때문에 int형 안에 포함된다
			int num = Integer.parseInt(br.readLine());
			
			//0이 입력된경우
			if(num == 0) {
				//우선순위 큐가 비어있다면 0을 출력
				if(pq.isEmpty()) System.out.println(0);
				else {
					//큐가 비어있지않다면 큐의 헤드값(최소값)을 출력 후 제거(poll사용)
					System.out.println(pq.poll());
				}
			}else {//0이 입력되지 않았다면 해당 값을 큐에 추가
				pq.add(num);
			}
		}
		
	}
}

	
