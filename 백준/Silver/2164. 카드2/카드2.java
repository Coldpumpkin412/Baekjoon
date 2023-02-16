import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = sc.nextInt();
		
		//1부터 N까지 수 큐에 넣기
		for(int i=1 ; i<=N ; i++) queue.offer(i);
		
		
		//큐의 크기가 1이 될 때까지 반복
		while(queue.size() != 1) {
			//맨 앞의 숫자 제거
			queue.poll();
			//맨 앞의 숫자 제거 후 뒤에 추가하기
			queue.offer(queue.poll());
		}
		
		
		System.out.print(queue.peek());
	}
	
}