import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 값이 들어올때마다 정렬을 위해 우선순위 큐 사용
		 * 우선순위 큐의 Comparator를 오버라이딩 통해 정렬 기준을 바꾸어준다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> p_queue = new PriorityQueue<>(
				(o1, o2) -> {
					//절댓값이 같은경우
					if(Math.abs(o1) == Math.abs(o2)){ 
						//o1이 더 크다면 양수 반환 → o1과 o2의 자리를 바꾼다
						//o1이 더 작다면 음수 반환 → 현재 자리 유지
						return o1 > o2 ? 1: -1;
					}else { //절댓값이 다른경우
						//return에서 양수가 반환되면 o1의 절댓값이 더 큰 경우 → o2,o1순으로 정렬
						//return에서 음수가 반환되면 o2의 절댓값이 더 큰 경우 → o1,o2순으로 정렬
						return Math.abs(o1) - Math.abs(o2);
					}
				});
		
		//연산의 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			int x = Integer.parseInt(br.readLine());
			
			//x가 0이라면 절댓값이 가장 작은 수 출력(절댓값이 같은 경우 가장 작은 수)
			if(x == 0) {
				if(p_queue.isEmpty()) { //큐가 비어있다면 0 출력
					System.out.println("0");
				}else {
					System.out.println(p_queue.poll());
				}
			}else {//x가 0이 아니라면 우선순위 큐에 x 추가
				p_queue.offer(x);
			}
		}
	}
}

	
