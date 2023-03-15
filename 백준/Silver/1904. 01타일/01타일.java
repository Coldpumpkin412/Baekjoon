import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 동적프로그래밍 활용하여 문제 풀기
		 * N에 따른 지원이 만들 수 있는 가짓 수를 계산해보았을 때
		 * N : 1	2	3	4	5	6 ...
		 * 결과:1		2	3	5	8	13 ...
		 * 
		 * 즉 3부터는 F(N) = F(N-1) + F(N-2) 라는 점화식을 도출해 낼 수 있다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		//N번째에 대한 값을 추출하기 위해 입력값 한도까지 선언
		int[] dp = new int[1000001];
		
		//초기값 선언
		dp[1] = 1;
		dp[2] = 2;
		
		//3부터는 점화식을 활용하여 값 할당해주기
		for(int i=3 ; i<=N ; i++) {
			dp[i] = (dp[i-1] + dp[i-2])%15746;
		}
		
		System.out.println(dp[N]);
	}
}

	
