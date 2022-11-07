import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 개수 입력
		
		for(int i=0 ; i<T ; i++) {
			int R = sc.nextInt(); //반복회수 R
			String S = sc.next(); //문자열 S 입력
			
			
			for(int j=0 ; j<S.length() ; j++) {
				for(int k=0 ; k<R ; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();

		}
	
	}
}