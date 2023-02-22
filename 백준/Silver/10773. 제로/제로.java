import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자 저장용 스택선언
		Stack<Integer> stack = new Stack<>();
		
		//정수 K입력
		int K = sc.nextInt();
		
		//정수 입력(0~1,000,000), 0일경우 스택의 헤드값 삭제, 아닌경우 스택에 추가
		for(int i=0 ; i<K ; i++) {
			int num = sc.nextInt();
			
			if(num==0) stack.pop();
			else stack.push(num);
			
		}
		
		//스택에 남아있는 값의 합 출력
		int sum=0;
		while(!stack.isEmpty()) sum += stack.pop();
		
		System.out.println(sum);
	}
}

	
