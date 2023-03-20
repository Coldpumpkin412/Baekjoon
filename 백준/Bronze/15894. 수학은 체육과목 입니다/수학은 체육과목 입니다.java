import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		/*
		 * 규칙성 찾기
		 * 둘레의 길이 = 상자의 개수 * 4
		 * 정사각형의 개수가 10^9까지이기 때문에 BigInteger클래스를 활용
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//BigInteger는 매개변수를 문자열 타입으로 받는다
		BigInteger number = new BigInteger(Integer.toString(n));
		
		//곱하기 함수를 활용
		System.out.println(number.multiply(BigInteger.valueOf(4)));
	}
}

	
