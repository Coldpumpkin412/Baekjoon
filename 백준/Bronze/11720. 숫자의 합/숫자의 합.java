import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //첫째 줄에 몇개의 숫자를 입력할지 정한다
		int sum=0; //저장할 변수 선언
		
		String number = sc.next(); //두번째 줄에 숫자를 문자열로 입력받음
		sc.close();
		
		for(int i=0 ; i<N ; i++) {
			 sum += number.charAt(i)-'0'; //아스키 코드값을 숫자로 반환
		}
		System.out.println(sum);
	}
}