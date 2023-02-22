import java.util.*;
import java.math.*; 

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0; //누적합
		
		//문자열의 길이 L 입력
		int L = sc.nextInt();
		
		String str = sc.next();
		
		for(int i=0 ; i<L ; i++) {
			//31의 거듭제곱의 값이 커질때를 대비하여 BigInteger활용
			/*
			 * 1.거듭제곱 꼴은 double형이 기본이기때문에 int형으로 캐스팅해 준다
			 * 2. BigIntger는 문자열을 인자로 받기때문에 1번에서 int형으로 캐스팅한 값을 문자열로 변환(Integer.toString 활용)
			 */
			BigInteger r = new BigInteger(Integer.toString((int)Math.pow(31, i)));
			
			/*
			 * 아스키코드 값을 활용하여 a부터 1...26까지의 값을 대입해주고
			 * BigInteger타입인 변수 r을 .intValue()를 활용하여 int형으로 변환해준다
			 */
			
			sum += (str.charAt(i)-96) * r.intValue();
					
		}
		
		System.out.println(sum);
	}
}

	
