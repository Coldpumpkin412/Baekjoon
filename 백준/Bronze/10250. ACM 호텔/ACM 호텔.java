import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수 입력
		
		for(int i=0 ; i<T ; i++) {
			int H = sc.nextInt(); //건물 높이
			int W = sc.nextInt(); //건물 거리
			int N = sc.nextInt(); //N번째 손님
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
 
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
	}

}
