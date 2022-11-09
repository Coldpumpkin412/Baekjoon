import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //생성자를 구할 정수 입력
		int result = 0; //결과
		
		for(int i=1 ; i<N ; i++) {
			int number = i;
			int sum=0; //생성자 찾을때 활용할 변수
			
			while(number!=0) {
				sum += number%10; //각자리수 덧셈
				number /= 10;
			}
			
			if(sum+i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}