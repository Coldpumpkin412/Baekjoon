import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 입력되는 두 정수의 범위로 인해 long형을 선언
		 */
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		//큰 수와 작은 수 판별 후 저장
		long max = Math.max(A, B);
		long min = Math.min(A, B);
		
		System.out.println((max+min)*(max-min+1)/2);
		
	}
}

	
