import java.util.*;



public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //수의 개수 입력
		int M = sc.nextInt(); //합을 구해야하는 횟수
		int[] sum = new int[N+1]; //구간합 저장배열
		
		sum[0] = 0;
		for(int i=1 ; i<=N ; i++) {
			sum[i] = sc.nextInt();
			sum[i] = sum[i]+sum[i-1]; //이전까지의 합 + 현재 수
		}
		
		for(int i=0 ; i<M ; i++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			
			//left부터 right까지의 부분합 : 1번~right번 까지의 부분 합 - 1번~(left-1)번 까지의 부분합
			System.out.println(sum[right]-sum[left-1]);
		}
		
		
		sc.close();
	}
}
