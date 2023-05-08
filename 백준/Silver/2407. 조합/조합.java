import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		//조합 (콤비네이션) 계산과정 중 숫자 범위를 초과할 수 있기에 BigInteger 활용
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//분자, 분모 초기값
		BigInteger numerator = new BigInteger("1");
		BigInteger denominator = new BigInteger("1");
		
		
		for(int i=0 ; i<M ; i++) {
			//분자
			BigInteger n_number = new BigInteger(Integer.toString(N-i));
			numerator = numerator.multiply(n_number);
			
			//분모
			BigInteger d_number = new BigInteger(Integer.toString(i+1));
			denominator = denominator.multiply(d_number);
		}
		
		System.out.println(numerator.divide(denominator));
	}
}	
