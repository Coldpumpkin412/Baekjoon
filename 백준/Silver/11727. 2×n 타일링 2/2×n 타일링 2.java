import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 동적프로그래밍 활용
		 * n=1 일 때 1개
		 * n=2 일 떼 3개
		 * n=3 일 때 부터 점화식 유추가능 (기존문제와 달리 2x2타일도 추가 되었음)
		 * 
		 * 즉, dp[n] = dp[n-1] + 2*dp[n-2]라는 점화식을 유추가능
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//동적 프로그래밍에 활용할 배열 선언(n은 최대 1000이므로 1001까지 선언
		int[] dp = new int[1001];
		
		//초기값 선언
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i=3 ; i<=1000 ; i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
		}
		
		System.out.println(dp[n]);
		
	}
}

	
