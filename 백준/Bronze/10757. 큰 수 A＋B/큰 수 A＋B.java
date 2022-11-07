import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger first = new BigInteger(sc.next()); //long타입을 넘는 범위의정수는
		BigInteger second = new BigInteger(sc.next()); //BigInteger를 사용한다.
		
		System.out.println(first.add(second)); //BigInteger 연산
	}

}
