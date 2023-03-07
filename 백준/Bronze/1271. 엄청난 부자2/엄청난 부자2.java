import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * 주어진 수의 범위가 10^1000까지이므로 기본 정수형 타입 사용 불가
		 * BigInteger 사용 : 문자열 형태로 이루어져있음
		 */
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		
        //BigInteger는 add, subtract, divide, reminder를 사용
		System.out.println(N.divide(M));
		System.out.println(N.remainder(M));
	}
}

	
