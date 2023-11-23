import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	//활용할 데크 선언
    	Deque<Integer> deque = new ArrayDeque<>();
    	
    	//명령어 수 N 입력
    	int N = sc.nextInt();
    	
    	//명령여 입력
    	while(N-->0) {
    		int num = sc.nextInt();
    		
    		if(num == 1) {
    			//정수 x를 덱 앞에 넣어주기
    			int x = sc.nextInt();
    			deque.offerFirst(x);
    		}else if(num == 2) {
    			//정수 x를 덱 뒤에 넣어주기
    			int x = sc.nextInt();
    			deque.offerLast(x);
    		}else if(num == 3) {
    			//데크에 정수 있다면 맨 앞 정수빼고 출력, 아니면 -1 출력
    			sb.append(!deque.isEmpty() ? deque.pollFirst() : -1).append("\n");
    		}else if(num == 4) {
    			//데크에 정수 있다면 맨 뒤 정수빼고 출력, 아니면 -1 출력
    			sb.append(!deque.isEmpty() ? deque.pollLast() : -1).append("\n");
    		}else if(num == 5) {
    			//데크에 들어있는 정수 개수 출력
    			sb.append(deque.size()).append("\n");
    		}else if(num == 6) {
    			//데크가 비어있으면 1, 아니면 0 출력
    			sb.append(deque.isEmpty() ? 1 : 0).append("\n");
    		}else if(num == 7) {
    			//데크에 정수 있다면 맨 앞 정수 출력, 아니면 -1 출력
    			sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
    		}else {
    			//데크에 정수 있다면 맨 뒤 정수 출력, 아니면 -1 출력
    			sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
