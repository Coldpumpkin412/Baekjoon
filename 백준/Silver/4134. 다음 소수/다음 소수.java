import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 입력값이 매우 크기때문에 BigInteger 클래스를 활용한다.
		 * 이 때, BigInteger 클래스 내에 isProbablePrime(10)을 활용하여 소수 여부를 쉽게 판별 가능하다.
		 * 소수가 아니라면 nextProbablePrime() 메소드를 통해 다음 큰 소수를 출력할 수 있다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			long number = Long.parseLong(br.readLine());
			
			//입력값이 크기때문에 BigInteger 활용
			//BigInteger는 문자열로 입출력값을 받는다
			BigInteger num = new BigInteger(Long.toString(number));
			
			if(num.isProbablePrime(10)) {
				System.out.println(num);
			}else {
				System.out.println(num.nextProbablePrime());
			}
		}
	}
}

	
