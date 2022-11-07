import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //동전의 종류 N개
		int K = sc.nextInt(); //만들어야하는 금액 K원
		
		int[] coinTypes = new int[N]; //가지고있는 동전의 종류 저장배열(오름차순)
		int count = 0; //사용하는 동전의 개수
		
		for(int i=0 ; i<N ; i++) {
			coinTypes[i] = sc.nextInt(); //동전의 종류 오름차순으로 입력
		}
		
		for(int i=N-1 ; i>=0 ; i--) { //오름차순인걸 이용하여 배열끝부터 시작
			if(K/coinTypes[i] == 0) continue; //필요한동전이 0개면 다음으로
			else {
				count += K/coinTypes[i];
				K %= coinTypes[i];
			}
		}
		System.out.println(count);
	}
}
