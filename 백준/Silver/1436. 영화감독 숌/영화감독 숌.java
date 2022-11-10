import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//종말의 숫자 : 6이 연속으로 3개

		int N = sc.nextInt();
		int count = 1;
		int devil = 666;

		while(N!=count) {
			devil++;
			if(String.valueOf(devil).contains("666")) count++;
		}
		System.out.println(devil);
	}
}