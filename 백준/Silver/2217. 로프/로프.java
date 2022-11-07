import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //줄의 개수
		Integer[] W = new Integer[N]; //각각의 줄이 버틸 수 있는 중량
		int max=0;
		
		for(int i=0 ; i<N ; i++) {
			W[i] = sc.nextInt(); //버틸 수 있는 중량 입력
		}
		
		Arrays.sort(W,Collections.reverseOrder()); //중량을 내림차순으로 정렬
		
		for(int i=1 ; i<=N ; i++) {
			max = Math.max(max, W[i-1]*i);
		}
		System.out.println(max);
	}

}
