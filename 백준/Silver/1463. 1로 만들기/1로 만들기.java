import java.util.*;
import java.io.*;

public class Main {
	/*
	 * 동적프로그래밍 활용
	 * 각 숫자를 인덱스로 하여 해당 숫자를 1로만드는 최소횟수를 값으로 갖는 배열 dp[] 선언
	 * dp배열에 대한 초기값 선언 (dp[0],dp[1])
	 * 
	 * 인덱스 2부터 패턴 활용
	 * 1) 인덱스가 2의 배수인 경우 : Math.min(-1 후 dp[i-1], 2로 나눈 후 dp[i/2])
	 * 2) 인덱스가 3의 배수인 경우 : Math.min(-1 후 dp[i-1], 3으로 나눈 후 dp[i/3])
	 * 3) 인덱스가 6의 배수인 경우 : 1,2번 중 최소값
	 * 4) 인덱스가 2,3의 배수가 아닌경우 : -1 후 dp[i-1]
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//정수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//동적프로그래밍에 활용할 배열 및 초기값 선언
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i=2 ; i<=N ; i++) {
			//인덱스가 6의 배수인 경우
			if(i%2==0 && i%3==0) {
				dp[i] = Math.min(1 + dp[i-1], Math.min(1 + dp[i/2], 1 + dp[i/3]));
			}else if(i%2 == 0) {//인덱스가 2의 배수인 경우
				dp[i] = Math.min(1 + dp[i-1], 1 + dp[i/2]);
			}else if(i%3 == 0) {//인덱스가 3의 배수인 경우
				dp[i] = Math.min(1 + dp[i-1], 1 + dp[i/3]);
			}else {//2,3의 배수가 아닌경우
				dp[i] = 1 + dp[i-1];
			}
		}
		
		System.out.println(dp[N]);
	}
}

	
