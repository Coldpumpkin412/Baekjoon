import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //카드의 개수 N
		int M = sc.nextInt(); //기준 숫자
		int[] arr = new int[N]; //카드 숫자들 저장 배열
		int result = 0; //결과값 저장 변수
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<N-2 ; i++) {
			for(int j=i+1 ; j<N-1 ; j++) {
				for(int k=j+1 ; k<N ; k++) {
					int sum = arr[i]+arr[j]+arr[k]; //세 카드의 합
					if(sum == M) result = sum;
					if(result<sum && sum<M) result = sum;
				}
			}
		}
		System.out.print(result);
		
	}
}