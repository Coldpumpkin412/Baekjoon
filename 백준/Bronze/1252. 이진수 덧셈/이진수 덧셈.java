import java.util.*;
import java.io.*;	
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 2진수 80자리를 10진수로 형변환 하면 2^80을 넘기게된다.
		 * long 형의 범위 : 최대 2^63
		 * 그러므로 BigInteger 사용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//2진수 두 개 입력
		st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		//BigInteger로 형변환 및 10진수 변환
		BigInteger change_A = new BigInteger(A, 2);
		BigInteger change_B = new BigInteger(B, 2);
		
		//더해주기(add함수 활용)
		BigInteger sum = change_A.add(change_B);
		
		//2진수 변환
		String answer = sum.toString(2);
		
		System.out.println(answer);
	}
}

	
