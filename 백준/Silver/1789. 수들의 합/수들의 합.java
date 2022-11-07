import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong(); //자연수 N의 최대값 입력, 범위로 인해 long선언
		long sum=0;
		int count=0;
		
		for(int i=1 ; ; i++) {
			if(sum > N) {
				System.out.println(count-1);
				break;
			}
			else {
				sum += i;
				count++;
			}
		}
	}

}
